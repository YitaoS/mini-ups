package edu.duke.ece568.minUPS.dao;

import edu.duke.ece568.minUPS.entity.Package;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PackageDao extends JpaRepository<PackageDao,Integer> {
    List<Package> findByTruck_TruckID(int truckID);

    @Modifying
    @Transactional
    @Query("UPDATE Package p SET p.status = :status WHERE p.packageID = :packageID")
    int updateStatus(@Param("id") Long packageID, @Param("status") String status);

}