package com.navin.controller;

import com.navin.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

    @RequestMapping("/register")
    public ModelAndView register(@ModelAttribute User user){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("welcome");
      modelAndView.addObject("ModelObject",user);
        return modelAndView;
    }
}
