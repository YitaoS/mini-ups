package edu.duke.ece568.minUPS.dao;

import edu.duke.ece568.minUPS.entity.ShipInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipInfoDao extends JpaRepository<ShipInfo,Long> {
}
