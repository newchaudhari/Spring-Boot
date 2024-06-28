package com.navin.sprinbootcustomloginvalidation.service;

import com.navin.sprinbootcustomloginvalidation.dao.UserDao;
import com.navin.sprinbootcustomloginvalidation.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService  {
    @Autowired
    UserDao userDao;

    public void addUser(User user){
        userDao.save(user);
        ResponseEntity.ok("User added successfully");
    }

}
