package edu.duke.ece568.minUPS.service;

import edu.duke.ece568.minUPS.ConnectionStream;
import edu.duke.ece568.minUPS.TruckTracker;
import edu.duke.ece568.minUPS.dao.PackageDao;
import edu.duke.ece568.minUPS.dao.TruckDao;
import edu.duke.ece568.minUPS.entity.Package;
import edu.duke.ece568.minUPS.entity.Truck;
import edu.duke.ece568.minUPS.protocol.UPStoWorld.*;
import edu.duke.ece568.minUPS.service.sender.QueryCommandSender;
import edu.duke.ece568.minUPS.service.sender.WorldCommandSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@Service
public class WorldService {
    private static Logger LOG =  LoggerFactory.getLogger(WorldService.class);
    private final ConnectionStream worldStream;
    private TruckDao truckDao;
    private PackageDao packageDao;
    private AmazonService amazonService;
    private long worldId;
    final int TRUCK_CNT = 10;
    final int TRUCK_X = 10;
    final int TRUCK_Y = 10;
    private static long seq = 0;

    HashSet<Integer> trackingSet;

    TruckTracker truckTracker;

    HashMap<Long, WorldCommandSender> seqHandlerMap;

    public void closeWorldStream()throws IOException {
        worldStream.close();
    }
    public void setWorldId(long worldId) {
        this.worldId = worldId;
    }
    @Autowired
    public WorldService(Socket worldSocket, TruckDao truckDao,PackageDao packageDao) throws IOException {
        this.worldStream = new ConnectionStream(worldSocket);
        this.truckDao = truckDao;
        this.packageDao = packageDao;
        this.amazonService = null;
        this.trackingSet = new HashSet<>();
    }

    public void connectWorld() throws IOException {
        UConnect.Builder uConnectBuilder = UConnect.newBuilder();
        uConnectBuilder.setWorldid(worldId);
        truckDao.deleteAll();
        for (int i = 0; i < TRUCK_CNT; ++i) {
            UInitTruck.Builder uInitBuilder = UInitTruck.newBuilder();
            uInitBuilder.setId(i).setX(TRUCK_X).setY(TRUCK_Y);
            uConnectBuilder.addTrucks(uInitBuilder.build());
            Truck truck = new Truck();
            truck.setPosX(TRUCK_X);
            truck.setPosY(TRUCK_Y);
            truck.setStatus(Truck.Status.IDLE.getText());
            truck.setTruckID(i);
            truckDao.save(truck);
        }
        uConnectBuilder.setIsAmazon(false);
        UConnect request = uConnectBuilder.build();
        request.writeDelimitedTo(worldStream.outputStream);
        worldStream.outputStream.flush();
        System.out.println("sent UConnect ...");
    }

    public void receiveConnectedFromWorld() throws IOException {
        UConnected uConnected = UConnected.parseFrom(worldStream.inputStream);
        String result = uConnected.getResult();
        if (!result.equalsIgnoreCase("connected!")) {
            System.err.println("World creating connection error:\n" + result);
            worldStream.close();
            System.exit(1);
        }
        System.out.println("UConnect: " + result + ", world id = " + worldId);
    }

    public void receiveUResponses() throws IOException {
        UResponses uResponses = UResponses.parseFrom(worldStream.inputStream);
        LOG.info("\nReceived a UResponse:\n len of Acks=" + uResponses.getAcksCount() + " uf=" + uResponses.getCompletionsCount()
                + " truckStatus=" + uResponses.getTruckstatusCount() + " delivered=" + uResponses.getDeliveredCount() + " err=" + uResponses.getErrorCount());

        handleUFinished(uResponses);
        handleUTruck(uResponses);
        handleUDeliveryMade(uResponses);
        handleAcks(uResponses);
        handleUErr(uResponses);
        if(uResponses.getFinished()){
            LOG.info("World disconnect!!!");
        }
    }

    private void handleUErr(UResponses uResponses) throws IOException{
        for (int i = 0; i < uResponses.getErrorCount(); ++i) {
            UErr uErr= uResponses.getError(i);
            sendAck(uErr.getSeqnum());
            LOG.warn("\nReceived  UError:\n"+ uErr.getErr() + "\nOriginal seq:"+ uErr.getOriginseqnum());
        }
    }

    private void handleUDeliveryMade(UResponses uResponses) {
    }

    private void handleAcks(UResponses uResponses) {
        int len = uResponses.getAcksCount();
        for (int i = 0; i < len; ++i) {
            long ack = uResponses.getAcks(i);
            System.out.println("Received ack = " + ack + " at index = " + i);
            if (seqHandlerMap.containsKey(ack)) {
                WorldCommandSender handler = seqHandlerMap.get(ack);
                handler.onReceive(uResponses, i);
                seqHandlerMap.remove(ack);
                LOG.info("\nReceived  Ack:\n"+ ack+ "\n");
                continue;
            }
            LOG.error("\nAck:\n"+ ack+ " has received twice!\n");
        }
    }

    private void handleUTruck(UResponses uResponses) throws IOException{
        for (int i = 0; i < uResponses.getTruckstatusCount(); ++i) {
            UTruck uTruck = uResponses.getTruckstatus(i);
            sendAck(uTruck.getSeqnum()); 
            updateTruckInfo(uTruck);
        }
    }

    private void updateTruckInfo(UTruck uTruck) {
        truckDao.updatePosition(uTruck.getTruckid(),uTruck.getX(), uTruck.getY());
        truckDao.updateStatus(uTruck.getTruckid(),uTruck.getStatus());
        System.out.println("Update position for Truck " + uTruck.getTruckid() + ": X = "
                + uTruck.getX() + ", Y = " + uTruck.getY() + ". Status: " +uTruck.getStatus());
    }

    public void sendAck(long ack) throws IOException {
        UCommands.Builder uCommandsBuilder = UCommands.newBuilder();
        uCommandsBuilder.addAcks(ack);
        UCommands uCommands = uCommandsBuilder.build();
        uCommands.writeDelimitedTo(worldStream.outputStream);
        worldStream.outputStream.flush();
    }
    public void handleUFinished(UResponses uResponses)throws IOException {
        for (int i = 0; i < uResponses.getCompletionsCount(); ++i) {
            UFinished uFinished = uResponses.getCompletions(i);
            LOG.info("--- Truck " + uFinished.getTruckid() + " status: " + uFinished.getStatus());
            sendAck(uFinished.getSeqnum());
            //database operation : truck arrive, waiting for package
            List<Package> packages = packageDao.findByTruck_TruckID(uFinished.getTruckid());
            ArrayList<Long> updatedPackageIDs = new ArrayList<>();
            for (Package pack : packages) {
                LOG.info("Package" + pack.getPackageID()+ " status : " + pack.getStatus());
                System.out.println();
                if (pack.getStatus().equalsIgnoreCase(Package.Status.ROUTING.getText())) {
                    pack.setStatus(Package.Status.WAITING.getText());
                    packageDao.updateStatus(pack.getPackageID(), Package.Status.WAITING.getText());
                    //inform amazon to load
                    updatedPackageIDs.add(pack.getPackageID());
                    LOG.info("Package" + pack.getPackageID()+ " status now chang to: " + Package.Status.WAITING.getText());
                }
            }
            if (updatedPackageIDs.isEmpty()) {
                LOG.info("Truck" + uFinished.getTruckid()+ " status now chang to: " + Truck.Status.IDLE.getText());
                truckDao.updateStatus(uFinished.getTruckid(), Truck.Status.IDLE.getText());
            }else {
                LOG.info("Truck" + uFinished.getTruckid()+ " status now chang to: " + Truck.Status.ARRIVE.getText());
                truckDao.updateStatus(uFinished.getTruckid(), Truck.Status.ARRIVE.getText());
                amazonService.sendTruckArrive(uFinished.getTruckid(), updatedPackageIDs);
            }
        }
    }

    public void trackingTruckInfo(Integer truckID)throws IOException {
        sendQuery(seq++, truckID);
    }
    public void sendQuery(long seqNum, int truckID) throws IOException {
        UCommands.Builder uCommandB = UCommands.newBuilder();
        UQuery.Builder uQueryB = UQuery.newBuilder();
        uQueryB.setTruckid(truckID).setSeqnum(seqNum);
        uCommandB.addQueries(uQueryB.build());
        UCommands commands = uCommandB.build();

        //putting in the map
        QueryCommandSender queryCommandSender = new QueryCommandSender(seqNum, truckID, this);
        System.out.println("@Sequence: start listen to query " + seqNum);
        seqHandlerMap.put(seqNum, queryCommandSender);

        //sending
        commands.writeDelimitedTo(worldStream.outputStream);
        worldStream.outputStream.flush();
    }

}
