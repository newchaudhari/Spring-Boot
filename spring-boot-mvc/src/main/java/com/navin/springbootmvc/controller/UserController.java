package com.navin.springbootmvc.controller;

import com.navin.springbootmvc.model.User;
import com.navin.springbootmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity<String> addUser(@ModelAttribute User user) {
        userService.addUser(user);
        return ResponseEntity.ok("user Added");
    }

    @PostMapping("/update")
    public void updateUser( @ModelAttribute User user){
        userService.updateUser(user);
    }

    @GetMapping("/get{id}")
    public Optional<User> getUser(@PathVariable int id){
       return userService.getUser(id);
    }

    @GetMapping("/get_all")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

}
