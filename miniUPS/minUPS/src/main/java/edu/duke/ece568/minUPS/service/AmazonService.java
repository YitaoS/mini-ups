package edu.duke.ece568.minUPS.service;

import edu.duke.ece568.minUPS.ConnectionStream;
import edu.duke.ece568.minUPS.dao.PackageDao;
import edu.duke.ece568.minUPS.dao.TruckDao;
import edu.duke.ece568.minUPS.entity.Package;
import edu.duke.ece568.minUPS.protocol.UPStoAmazon.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class AmazonService {
    private static Logger LOG =  LoggerFactory.getLogger(AmazonService.class);
    private WorldService worldService;
    private ConnectionStream amazonStream;
    private TruckDao truckDao;

    private PackageDao packageDao;

    @Autowired
    public AmazonService(TruckDao truckDao, PackageDao packageDao) {
        this.truckDao = truckDao;
        this.packageDao = packageDao;
        this.worldService = null;
        this.amazonStream = null;
    }
    public long receiveWorldId() throws IOException {
        // Read the message from the socket
        AInformWorld worldId = AInformWorld.parseDelimitedFrom(amazonStream.inputStream);
        System.out.println("Received: " + worldId);

        // Send a response message
        UReceivedWorld ACKMessage = UReceivedWorld.newBuilder().setWorldid(worldId.getWorldid()).build();
        ACKMessage.writeDelimitedTo(amazonStream.outputStream);
        amazonStream.outputStream.flush();
        return worldId.getWorldid();
    }
    public void sendUTruckArrived(int truckID, ArrayList<Long> updatedPackageIDs) {
        new Thread(() -> {
            try {
                //writing
                UACommunication.Builder uaCommunication = UACommunication.newBuilder();
                for(Long packageID :updatedPackageIDs){
                    UTruckArrived.Builder uaTruckArrive = UTruckArrived.newBuilder();
                    uaTruckArrive.setTruckid(truckID).setPackageid(packageID);
                    uaCommunication.addArrived(uaTruckArrive);

                }
                UACommunication responses = uaCommunication.build();
                LOG.info("Sending to amazon: Truck " + truckID + " with Packages arrived");
                responses.writeDelimitedTo(amazonStream.outputStream);
                amazonStream.outputStream.flush();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public void setAmazonStream(Socket socket) throws IOException{
        this.amazonStream = new ConnectionStream(socket);
    }

    public void closeAmazonStream()throws IOException{
        this.amazonStream.close();
    }

    public void setWorldId(long worldID) {
        worldService.setWorldId(worldID);
    }

    public void setWorldService(WorldService worldService){
        this.worldService = worldService;
    }

    public void receiveAUCommunication() throws IOException{
        AUCommunication auCommunication = AUCommunication.parseFrom(amazonStream.inputStream);
        LOG.info("\nReceived a AUCommunication:\n len of ABookTruck=" + auCommunication.getBookingsCount()+
                " AStartDeliver=" + auCommunication.getDeliversCount());
        handleABookTruck(auCommunication);
        handleAStartDeliver(auCommunication);
    }

//    message AStartDeliver {
//        required int64 packageid = 1;
//        optional int64 seqnum = 2;
//    }
    private void handleAStartDeliver(AUCommunication auCommunication) {
        new Thread(() -> {
            try {
                for (int i = 0; i < auCommunication.getDeliversCount(); i++) {
                    AStartDeliver aStartDeliver = auCommunication.getDelivers(i);
                    LOG.info("Amazon: start deliver packageID = " + aStartDeliver.getPackageid());
                    Optional<Package> packageOptional = packageDao.findById(aStartDeliver.getPackageid());
                    if(packageOptional.isEmpty()){
                        LOG.error("This is a new package!");
                        continue;
                    }
                    worldService.goDeliver(aStartDeliver.getPackageid());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

//    message ABookTruck {
//        required int64 packageid = 1;
//        required int32 warehouseid = 2;
//        required int32 warehousex = 3;
//        required int32 warehousey = 4;
//        required int32 destinationx = 5;
//        required int32 destinationy = 6;
//        optional string upsid = 7;
//        optional string detail = 9;
//
//    }
    private void handleABookTruck(AUCommunication auCommunication) {
        new Thread(() -> {
            try {
                for(int i = 0; i < auCommunication.getBookingsCount(); i++){
                    ABookTruck aBookTruck = auCommunication.getBookings(i);
                    LOG.info("--- BOOK Truck" + "\npackageID:" + aBookTruck.getPackageid()
                            + "\nwarehouseID: " + aBookTruck.getWarehouseid()
                            + "\nwarehouseX: " + aBookTruck.getWarehousex()
                            + "\nwarehouseY: " + aBookTruck.getWarehousey()
                            + "\ndestinationX: " + aBookTruck.getDestinationx()
                            + "\ndestinationY: " + aBookTruck.getDestinationy()
                            + "\nupsID: " + aBookTruck.getUpsid()
                            + "\ndetail: " + aBookTruck.getDetail()
                    );
                    //database operation:
                    Package pack = new Package();
                    pack.setPackageID(aBookTruck.getPackageid());
                    pack.setWarehouseID(aBookTruck.getWarehouseid());
                    pack.setDestinationX(aBookTruck.getDestinationx());
                    pack.setDestinationY(aBookTruck.getDestinationy());
                    pack.setUpsID(aBookTruck.getUpsid());
                    pack.setDetails(aBookTruck.getDetail());
                    pack.setStatus(Package.Status.CREATED.getText());
                    createPackage(pack);
                    int truckID = worldService.findAvailableTrucks(pack);
                    LOG.info("---find truck " + truckID + " to deliver the package");
                    packageDao.updateTruckID(aBookTruck.getPackageid(),truckID);
                    worldService.trackingSet.add(truckID);
                    worldService.pickup(truckID,aBookTruck.getWarehouseid(),pack.getPackageID());
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

    }

    private void createPackage(Package pack) {
        packageDao.save(pack);
    }
//    message UDelivered{
//        required int64 packageid = 1;
//        optional int64 seqnum = 2;
//    }
    public void sendUDelivered(long packageID) {
        new Thread(() -> {
            try {
                UACommunication.Builder uaCommunication = UACommunication.newBuilder();
                UDelivered.Builder uDeliveredB = UDelivered.newBuilder();
                uDeliveredB.setPackageid(packageID);
                uaCommunication.addDelivered(uDeliveredB.build());
                UACommunication responses = uaCommunication.build();

                LOG.info("Sending to amazon: package " + packageID + " is delivered ");
                responses.writeDelimitedTo(amazonStream.outputStream);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
