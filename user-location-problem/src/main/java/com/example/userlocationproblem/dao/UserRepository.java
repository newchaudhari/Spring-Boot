package com.example.userlocationproblem.dao;

import com.example.userlocationproblem.model.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import java.util.List;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<UserLocation, Long> {
    //This class is used to generate query

    @Query(value = "SELECT * FROM user_location WHERE excluded =false ORDER BY (latitude*latitude + longitude*longitude) asc LIMIT :n", nativeQuery = true)
    List<UserLocation> getNearestUsers(@Param("n") int n);
}
