package edu.duke.ece568.minUPS.handler;

import edu.duke.ece568.minUPS.ConnectionStream;
import edu.duke.ece568.minUPS.protocol.UPStoAmazon.AInformWorld;
import edu.duke.ece568.minUPS.protocol.UPStoAmazon.UReceivedWorld;
import edu.duke.ece568.minUPS.service.WorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.CyclicBarrier;

@Component
public class ThreadHandler {
    private static Logger LOG =  LoggerFactory.getLogger(WorldService.class);
    ServerSocket serverSocket;
    AmazonHandler amazonHandler;
    WorldHandler worldHandler;
    @Autowired
    public ThreadHandler(ServerSocket serverSocket, AmazonHandler amazonHandler, WorldHandler worldHandler) {
        this.serverSocket = serverSocket;
        this.amazonHandler = amazonHandler;
        this.worldHandler = worldHandler;
        startServer();
    }
    private void startServer() {
        try {
            // Create a CyclicBarrier for two threads
            CyclicBarrier barrier = new CyclicBarrier(2);
            amazonHandler.setBarrier(barrier);
            worldHandler.setBarrier(barrier);
            // Create two BarrierTasks with the same CyclicBarrier
            System.out.println("Server is listening on port " + serverSocket.getLocalPort());
            Socket socket = serverSocket.accept();
            amazonHandler.setAmazonStream(socket);
            new Thread(amazonHandler).start();
            new Thread(worldHandler).start();
        } catch (IOException e) {
            LOG.error("Error starting server: " + e.getMessage());
        }
    }


}