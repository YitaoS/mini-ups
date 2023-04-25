package edu.duke.ece568.minUPS.dao;

import edu.duke.ece568.minUPS.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
    User findByEmail(String email);


}