package com.navin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class GreetController {
//    DispatcherServlet
//    InternalResourceViewResolver

//    @RequestMapping(method = RequestMethod.GET , value = "/greet")
    @GetMapping("/greet")
    public String getGreet(){
        return "greeting";
    }


}
