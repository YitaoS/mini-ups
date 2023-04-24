package edu.duke.ece568.minUPS.dao;

import edu.duke.ece568.minUPS.entity.Truck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckDao extends JpaRepository<Truck,Long> {
}
