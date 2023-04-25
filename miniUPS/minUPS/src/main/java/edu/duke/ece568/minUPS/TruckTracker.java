package edu.duke.ece568.minUPS;

import edu.duke.ece568.minUPS.service.WorldService;

import java.io.IOException;
import java.util.HashSet;

public class TruckTracker extends Thread {
    private HashSet<Integer> trackingSet;
    private WorldService worldService;

    TruckTracker(HashSet<Integer> trackingSet, WorldService worldService) {
        this.trackingSet = trackingSet;
        this.worldService = worldService;
    }

    @Override
    public void run() {
        System.out.println("Running distance checker ... ");
        while (true) {
            try {
                Thread.sleep(1000);
                if (trackingSet.isEmpty()) {
                    continue;
                }
                for (Integer truckID : trackingSet) {
                    worldService.trackingTruckInfo(truckID);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
