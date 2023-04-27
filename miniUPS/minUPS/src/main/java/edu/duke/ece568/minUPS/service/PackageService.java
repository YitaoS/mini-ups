package edu.duke.ece568.minUPS.service;

import edu.duke.ece568.minUPS.entity.Package;
import edu.duke.ece568.minUPS.dao.PackageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageService {
    @Autowired
    private PackageDao packageDao;
    public List<Package> findAllByUpsID(String upsID) {
        return packageDao.findAllByUpsID(upsID);
    }

    public Package updateDestination(Long packageID, Integer destinationX, Integer destinationY) {
        Package pkg = packageDao.findById(packageID).orElse(null);
        if (pkg != null) {
            pkg.setDestinationX(destinationX);
            pkg.setDestinationY(destinationY);
            return packageDao.save(pkg);
        }
        return null;
    }


}
