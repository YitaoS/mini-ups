import java.io.IOException;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AmazonServer {
    private final static Logger LOG =  LoggerFactory.getLogger(AmazonServer.class);
    private final ConnectionStream worldStream;
    private final ConnectionStream upsStream;
    private final String WORLD_HOST = "vcm-33355.vm.duke.edu";
    private final int WORLD_PORT = 23456;
    private final String UPS_HOST = "vcm-33355.vm.duke.edu";
    private final int UPS_PORT = 22222;

    @Autowired
    public AmazonServer(Socket worldSocket,UpsServer upsServer) {
        this.worldStream = new ConnectionStream(new Socket(WORLD_HOST, WORLD_PORT));
        this.upsStream = new ConnectionStream(new Socket(UPS_HOST, UPS_PORT));
        startServer();
    }
    private void startServer() {
        try {

        } catch (IOException e) {
            LOG.error("Error starting server: " + e.getMessage());
        }
    }

}