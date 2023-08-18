package com.navin.springbasicsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AppController {

    @GetMapping("/admin")
    public String security(){
        return "Welcome to the Spring ADMIN";
    }

    @GetMapping("/user")
    public String user(){
        return "Welcome to the Spring USER";
    }

    @GetMapping("/public")
    public String publicM(){
        return "Welcome to the Spring PUBLIC";
    }
}
