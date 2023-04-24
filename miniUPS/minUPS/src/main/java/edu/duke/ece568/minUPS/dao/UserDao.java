package edu.duke.ece568.minUPS.dao;

import edu.duke.ece568.minUPS.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
