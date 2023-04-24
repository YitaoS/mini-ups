package edu.duke.ece568.minUPS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTrackingInfoDao extends JpaRepository<UserTrackingInfoDao,Integer> {
}
