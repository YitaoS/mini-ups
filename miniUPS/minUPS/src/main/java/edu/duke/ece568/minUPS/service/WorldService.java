package edu.duke.ece568.minUPS.service;

import edu.duke.ece568.minUPS.dao.TruckDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorldService {

    private final TruckDao truckDao;

    @Autowired
    public WorldService(TruckDao truckDao){
        this.truckDao = truckDao;
    }
}
