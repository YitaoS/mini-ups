package edu.duke.ece568.minUPS.service;

import edu.duke.ece568.minUPS.ConnectionStream;
import edu.duke.ece568.minUPS.ShipStatus;
import edu.duke.ece568.minUPS.dao.TruckDao;
import edu.duke.ece568.minUPS.entity.Truck;
import edu.duke.ece568.minUPS.protocol.UPStoWorld.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

@Service
public class WorldService {
    private final ConnectionStream worldStream;
    private TruckDao truckDao;

    private AmazonService amazonService;
    private long worldId;
    final int TRUCK_CNT = 10;
    final int TRUCK_X = 10;
    final int TRUCK_Y = 10;

    public void closeWorldStream()throws IOException {
        worldStream.close();
    }
    public void setWorldId(long worldId) {
        this.worldId = worldId;
    }
    @Autowired
    public WorldService(Socket worldSocket, TruckDao truckDao,AmazonService amazonService) throws IOException {
        this.worldStream = new ConnectionStream(worldSocket);
        this.truckDao = truckDao;
        this.amazonService = amazonService;
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
        if (!result.equals("connected!")) {
            System.err.println("World creating connection error:\n" + result);
            worldStream.close();
            System.exit(1);
        }
        System.out.println("UConnect: " + result + ", world id = " + worldId);
    }

    public void receiveUResponses() throws IOException {
        UResponses uResponses = UResponses.parseFrom(worldStream.inputStream);
        System.out.println("Received a UResponse: len of acks=" + uResponses.getAcksCount() + " uf=" + uResponses.getCompletionsCount()
                + " truckStatus=" + uResponses.getTruckstatusCount() + " delieverd=" + uResponses.getDeliveredCount() + " err=" + uResponses.getErrorCount());

        handleUFinished(uResponses);
//        handleQuery(uResponses);
//        handleDelivered(uResponses);
//        handleAcks(uResponses);
    }

    public void sendAckCommands(long ack) throws IOException {
        UCommands.Builder uCommandsBuilder = UCommands.newBuilder();
        uCommandsBuilder.addAcks(ack);
        UCommands uCommands = uCommandsBuilder.build();
        uCommands.writeDelimitedTo(worldStream.outputStream);
        worldStream.outputStream.flush();
    }
    public void handleUFinished(UResponses uResponses)throws IOException {
//        for (int i = 0; i < uResponses.getCompletionsCount(); ++i) {
//            UFinished uFinished = uResponses.getCompletions(i);
//            System.out.println("--- Truck " + uFinished.getTruckid() + " status: " + uFinished.getStatus());
//            sendAckCommands(uFinished.getSeqnum());
//            //database operation : truck arrive, waiting for package
//            List<ShipInfo> shipInfoList = shipInfoDao.findShipInfoByTruckID(uFinished.getTruckid());
//            int count = 0;
//            for (ShipInfo shipInfo : shipInfoList) {
//                System.out.println("ship status : " + shipInfo.getStatus());
//                if (shipInfo.getStatus().equals(ShipStatus.ROUTING.getText())) {
//                    ++count;
//                    shipInfo.setStatus(ShipStatus.WAITING.getText());
//                    shipInfoDao.updateStatus(shipInfo.getShipID(), ShipStatus.WAITING.getText());
//                    truckDao.updateStatus(uFinished.getTruckid(), Truck.Status.ARRIVE.getText());
//                    //inform amazon to load
//                    ArrayList<Long> shipIDs = new ArrayList<>();
//                    shipIDs.add(shipInfo.getShipID());
//                   // amazonService.sendTruckArrive(shipInfo.getTruckID(), shipInfo.getShipID());
//                }
//            }
//            if (count == 0) {
//                //  truckDao.updateTruckStatus(uFinished.getTruckid(), Truck.Status.IDLE.getText());
//            }
//        }
    }
}
