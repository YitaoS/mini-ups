package edu.duke.ece568.minUPS.dao;

import edu.duke.ece568.minUPS.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<Users,Integer> {
}
