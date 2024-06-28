package com.navin.sprinbootcustomloginvalidation.controller;

import com.navin.sprinbootcustomloginvalidation.model.User;
import com.navin.sprinbootcustomloginvalidation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @PostMapping("/user")
    public void login(@RequestBody User user){
        userService.addUser(user);
    }


}
