package com.navin.springbootmvc.service;

import com.navin.springbootmvc.dao.UserDao;
import com.navin.springbootmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public void addUser(User user){
        userDao.save(user);

    }
    public ResponseEntity<String> updateUser(User user){
        userDao.save(user);
        return ResponseEntity.ok("user updated successfully");
    }
    public Optional<User> getUser(int id){
        Optional<User> byId = userDao.findById(id);
        return byId;
    }
    public List<User> getAllUsers(){
        return userDao.findAll();
    }
}
