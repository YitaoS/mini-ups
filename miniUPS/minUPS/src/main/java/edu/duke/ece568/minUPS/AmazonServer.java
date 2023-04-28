package edu.duke.ece568.minUPS;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Io;
import org.springframework.stereotype.Component;

import antlr.collections.List;
import edu.duke.ece568.minUPS.protocol.AmazontoWorld.AConnect;
import edu.duke.ece568.minUPS.protocol.AmazontoWorld.AConnected;
import edu.duke.ece568.minUPS.protocol.AmazontoWorld.AInitWarehouse;
import edu.duke.ece568.minUPS.protocol.UPStoAmazon.AInformWorld;

@Component
public class AmazonServer {
    private final static Logger LOG =  LoggerFactory.getLogger(AmazonServer.class);
    private final ConnectionStream worldStream;
    private ConnectionStream upsStream;
    private final String WORLD_HOST = "vcm-33348.vm.duke.edu";
    private final int WORLD_PORT = 23456;
    private final String UPS_HOST = "vcm-33355.vm.duke.edu";
    private final int UPS_PORT = 22222;

    public AmazonServer() throws IOException{
        this.worldStream = new ConnectionStream(new Socket(WORLD_HOST, WORLD_PORT));
    }
    public void setUpsStream()throws IOException{
        this.upsStream = new ConnectionStream(new Socket(UPS_HOST, UPS_PORT));
    }
    public void startServer() {
        LOG.info("AMAZON server start");
        try {
            connectWorld();
            sendWorld(receiveWorld());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // message AConnect{
    //     optional int64 worldid = 1;
    //     repeated AInitWarehouse initwh = 2;
    //     required bool isAmazon = 3;
    //   }

    private void sendWorld(long receiveWorld)throws IOException {
        AInformWorld.Builder aBuilder = AInformWorld.newBuilder();
        aBuilder.setWorldid(receiveWorld);
        AInformWorld aInformWorld= aBuilder.build();
        aInformWorld.writeDelimitedTo(upsStream.outputStream);
        upsStream.outputStream.flush();

    }
    private void connectWorld() throws IOException{
        AConnect.Builder aBuilder = AConnect.newBuilder();
        for (int i = 0; i < 5; ++i) {
            AInitWarehouse.Builder aInitBuilder = AInitWarehouse.newBuilder();
            aInitBuilder.setId(i).setX(i).setY(i);
            aBuilder.addInitwh(aInitBuilder.build());
        }
        aBuilder.setIsAmazon(true);
        AConnect request = aBuilder.build();
        // LOG.info("sending world -------- " + request + "-----------\n");
        request.writeDelimitedTo(worldStream.outputStream);
        worldStream.outputStream.flush();
    }
    private long receiveWorld()throws IOException{
        AConnected aConnected = AConnected.parseDelimitedFrom(worldStream.inputStream);
        return aConnected.getWorldid();
    }
}