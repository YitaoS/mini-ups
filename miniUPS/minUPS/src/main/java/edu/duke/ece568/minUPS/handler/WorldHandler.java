package edu.duke.ece568.minUPS.handler;

import edu.duke.ece568.minUPS.ConnectionStream;
import edu.duke.ece568.minUPS.ShipStatus;
import edu.duke.ece568.minUPS.dao.TruckDao;
import edu.duke.ece568.minUPS.entity.Truck;
import edu.duke.ece568.minUPS.protocol.UPStoWorld.*;
import edu.duke.ece568.minUPS.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

@Component
public class WorldHandler implements Runnable {
    private CyclicBarrier barrier;
    private WorldService worldService;




    @Autowired
    public WorldHandler(Socket worldSocket,WorldService worldService) throws IOException {
        this.worldService = worldService;
    }

    @Override
    public void run() {
        System.out.println("World handler running...");
        try {
            barrier.await();
            connectWorld();
            receiveConnectedFromWorld();
            startWorldListener();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                worldService.closeWorldStream();
            } catch (IOException e) {
                System.err.println("Error closing socket: " + e.getMessage());
            }
        }
    }

    private void connectWorld() throws IOException{
        worldService.connectWorld();
    }


    public void setBarrier(CyclicBarrier barrier) {
        this.barrier = barrier;
    }



    private void receiveConnectedFromWorld() throws IOException {
       worldService.receiveConnectedFromWorld();
    }

    private void startWorldListener() {
        new Thread(() -> {
            while (true) {
                try {
                    receiveUResponses();
                } catch (IOException e) {
                }
            }
        }).start();
    }

    private void receiveUResponses() throws IOException {
        worldService.receiveUResponses();
    }

}
