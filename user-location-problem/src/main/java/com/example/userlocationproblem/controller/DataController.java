package com.example.userlocationproblem.controller;

import com.example.userlocationproblem.model.UserLocation;
import com.example.userlocationproblem.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class DataController {
    //Request come from client here first
    @Autowired
    DataService dataService;

    //create data table
    @PostMapping("/create_data")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> createTable(@RequestBody UserLocation userLocation) {
        dataService.createTable(userLocation);
        return ResponseEntity.ok("Created Successfully");
    }

    //update data table if presents
    @PatchMapping("/update_data/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> updateUserLocation(@PathVariable Long id, @RequestBody UserLocation user) {
        dataService.UpdateUserLocation(id, user);
        return ResponseEntity.ok("User Location Updated Successfully");
    }

    //get data which is near
    @GetMapping("/get_data/{n}")
    @PreAuthorize("hasAnyRole('ADMIN','READER')")
    public ResponseEntity<List<UserLocation>> getNearestUsers(@PathVariable int n) {
        List<UserLocation> nearestUsers = dataService.getNearestUsers(n);
        return ResponseEntity.ok(nearestUsers);
    }

    //delete user id
    @DeleteMapping("/delete_data/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> deleteData(@PathVariable Long id) {
        dataService.deleteById(id);
        return ResponseEntity.ok("Data deleted Successfully");
    }
}
