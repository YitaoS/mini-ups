package edu.duke.ece568.minUPS.handler;

import edu.duke.ece568.minUPS.ConnectionStream;
import edu.duke.ece568.minUPS.protocol.UPStoAmazon.AInformWorld;
import edu.duke.ece568.minUPS.protocol.UPStoAmazon.UReceivedWorld;
import edu.duke.ece568.minUPS.service.AmazonService;
import edu.duke.ece568.minUPS.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

@Component
public class AmazonHandler implements Runnable {

    private AmazonService amazonService;

    private CyclicBarrier barrier;

    @Autowired
    public AmazonHandler(AmazonService amazonService) {
        this.amazonService = amazonService;
    }

    @Override
    public void run() {
        System.out.println("Amazon handler thread running...");
        try  {
            long worldID = amazonService.receiveWorldId();
            amazonService.setWorldId(worldID);
            barrier.await();
        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                amazonService.closeAmazonStream();
            } catch (IOException e) {
                System.err.println("Error closing socket: " + e.getMessage());
            }
        }
    }

    public void setBarrier(CyclicBarrier barrier){
        this.barrier = barrier;
    }

    public void setAmazonStream(Socket socket) throws IOException{
        amazonService.setAmazonStream(socket);
    }
}