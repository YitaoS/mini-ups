package edu.duke.ece568.minUPS.handler;

import edu.duke.ece568.minUPS.ConnectionStream;
import edu.duke.ece568.minUPS.dao.TruckDao;
import edu.duke.ece568.minUPS.entity.Truck;
import edu.duke.ece568.minUPS.protocol.UPStoWorld.UConnect;
import edu.duke.ece568.minUPS.protocol.UPStoWorld.UInitTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.CyclicBarrier;

@Component
public class WorldHandler implements Runnable{
    private final ConnectionStream worldStream;
    private final AmazonHandler amazonHandler;
    private long worldId;
    private CyclicBarrier barrier;
    private TruckDao truckDao;

    final int TRUCK_CNT = 10;
    final int TRUCK_X = 10;
    final int TRUCK_Y = 10;
    @Autowired
    public WorldHandler(Socket worldSocket, AmazonHandler amazonHandler, TruckDao truckDao) throws IOException{
        this.worldStream = new ConnectionStream(worldSocket);
        this.amazonHandler = amazonHandler;
    }

    @Override
    public void run() {
        System.out.println("World handler running...");
        try  {
            barrier.await();
            connectWorld(worldId);

        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                worldStream.close();
            } catch (IOException e) {
                System.err.println("Error closing socket: " + e.getMessage());
            }
        }
    }

    public void setWorldId(long worldId){
        this.worldId = worldId;
    }

    public void setBarrier(CyclicBarrier barrier){
        this.barrier = barrier;
    }

    private void connectWorld(long worldId)throws IOException{
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
            truck.setId(i);
            truckDao.save(truck);
        }
        uConnectBuilder.setIsAmazon(false);
        UConnect request = uConnectBuilder.build();
        request.writeDelimitedTo(worldStream.outputStream);
        worldStream.outputStream.flush();
        System.out.println("sent UConnect ..." );
    }
}
