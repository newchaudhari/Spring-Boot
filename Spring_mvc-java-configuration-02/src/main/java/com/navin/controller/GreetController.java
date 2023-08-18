package com.navin.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class GreetController {
//    DispatcherServlet
//    InternalResourceViewResolver

    @RequestMapping(value = "/greet")
//    @GetMapping("/greet")
    public String getGreet(){

            return "greeting";

    }

    @GetMapping("/hello")
    public String hello(){
        return "helloPage";
    }


}
