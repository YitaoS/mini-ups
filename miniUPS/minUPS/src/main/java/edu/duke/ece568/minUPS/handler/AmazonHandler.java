package edu.duke.ece568.minUPS.handler;

import edu.duke.ece568.minUPS.ConnectionStream;
import edu.duke.ece568.minUPS.protocol.UPStoAmazon.AInformWorld;
import edu.duke.ece568.minUPS.protocol.UPStoAmazon.UReceivedWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

@Component
public class AmazonHandler implements Runnable {
    private ConnectionStream amazonStream;

    private final WorldHandler worldHandler;

    private CyclicBarrier barrier;

    @Autowired
    public AmazonHandler(WorldHandler worldHandler) {
        this.worldHandler = worldHandler;
        this.amazonStream = null;
    }

    @Override
    public void run() {
        System.out.println("Amazon handler thread running...");
        try  {
            long worldID = receiveWorldId();
            worldHandler.setWorldId(worldID);
            barrier.await();
        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                amazonStream.close();
            } catch (IOException e) {
                System.err.println("Error closing socket: " + e.getMessage());
            }
        }
    }
    private long receiveWorldId() throws IOException{
        // Read the message from the socket
        AInformWorld worldId = AInformWorld.parseDelimitedFrom(amazonStream.inputStream);
        System.out.println("Received: " + worldId);

        // Send a response message
        UReceivedWorld ACKMessage = UReceivedWorld.newBuilder().setWorldid(worldId.getWorldid()).build();
        ACKMessage.writeDelimitedTo(amazonStream.outputStream);
        amazonStream.outputStream.flush();
        return worldId.getWorldid();
    }

    public void setAmazonStream(Socket socket) throws IOException{
        this.amazonStream = new ConnectionStream(socket);
    }

    public void setBarrier(CyclicBarrier barrier){
        this.barrier = barrier;
    }


}