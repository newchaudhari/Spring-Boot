package com.example.userlocationproblem.service;

import com.example.userlocationproblem.dao.UserRepository;
import com.example.userlocationproblem.model.UserLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DataService {
    //Request comes here from controller, and we write all business logic here
    @Autowired
    UserRepository userRepository;

    @Transactional
    public void createTable(UserLocation userLocation) {
        userRepository.save(userLocation);
    }

    public void UpdateUserLocation(Long id, UserLocation user) {
        UserLocation existingLocation = userRepository.findById(id).orElse(null);
        if (existingLocation != null) {
            existingLocation.setName(user.getName());
            existingLocation.setLatitude(user.getLatitude());
            existingLocation.setLongitude(user.getLongitude());
        }
        userRepository.save(existingLocation);
    }

    public List<UserLocation> getNearestUsers(int n) {
        return userRepository.getNearestUsers(n);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

}
