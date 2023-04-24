package edu.duke.ece568.minUPS.config;

import com.google.protobuf.CodedOutputStream;
import edu.duke.ece568.minUPS.dao.TruckDao;
import edu.duke.ece568.minUPS.entity.Truck;
import edu.duke.ece568.minUPS.protocol.UPStoWorld.UConnectOrBuilder;
import edu.duke.ece568.minUPS.protocol.UPStoWorld.UInitTruck;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TruckConfiguration {
    private final int TRUCK_CNT = 10000;
    private final int TRUCK_X = 1;
    private final int TRUCK_Y = 1;

    private static int truck_alloc = 0;

    @Bean
    CommandLineRunner commandLineRunner(TruckDao truckDao) {
        return args -> {
        };
    }
}