package edu.duke.ece568.minUPS.service;

import edu.duke.ece568.minUPS.ConnectionStream;
import edu.duke.ece568.minUPS.protocol.UPStoAmazon.AInformWorld;
import edu.duke.ece568.minUPS.protocol.UPStoAmazon.UACommunication;
import edu.duke.ece568.minUPS.protocol.UPStoAmazon.UReceivedWorld;
import edu.duke.ece568.minUPS.protocol.UPStoAmazon.UTruckArrived;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class AmazonService {
    private WorldService worldService;

    private ConnectionStream amazonStream;

    @Autowired
    public AmazonService() {
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
    public void sendTruckArrive(int truckID, long packageID) {
        new Thread(() -> {
            try {
                //writing
                UACommunication.Builder uaResponse = UACommunication.newBuilder();
                UTruckArrived.Builder uaTruckArrive = UTruckArrived.newBuilder();
                uaTruckArrive.setTruckid(truckID).setPackageid(packageID);
                uaResponse.addArrived(uaTruckArrive);
                UACommunication responses = uaResponse.build();
                System.out.println("Sending to amazon: Truck " + truckID + " with Package "+ packageID + " arrived");
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
}
