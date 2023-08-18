package com.navin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @RequestMapping("/data")
    public ModelAndView greeting(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("greeting");
        modelAndView.addObject("name","Navin");
        return modelAndView;
    }
}
