package edu.duke.ece568.minUPS.dao;

import edu.duke.ece568.minUPS.entity.ShipInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShipInfoDao extends JpaRepository<ShipInfo,Long> {
    @Query("SELECT s FROM ShipInfo s WHERE s.truckID = :truckID")
    List<ShipInfo> findShipInfoByTruckID(@Param("truckID") int truckID);

    @Modifying
    @Transactional
    @Query("UPDATE ShipInfo s SET s.status = :status WHERE s.shipID = :shipID")
    int updateStatus(@Param("shipID") Long shipID, @Param("status") String status);


}
