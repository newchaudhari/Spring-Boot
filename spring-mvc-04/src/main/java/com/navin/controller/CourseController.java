package com.navin.controller;


import com.navin.model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {
    public static List<Course> courseList = new ArrayList<Course>();

    {
        Course course1 = new Course(1, "Java", 10000);
        Course course2 = new Course(2, "Python", 15000);
        courseList.add(course1);
        courseList.add(course2);

    }
    @GetMapping
    public ModelAndView getAllCourses(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("courselist");
        modelAndView.addObject("CourseList", courseList);
        return modelAndView;
    }

    @GetMapping("/{courseId}")
    public ModelAndView getCourseById(@PathVariable int courseId){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("courselist");
        modelAndView.addObject("CourseList",findCourseByID(courseId));
        return modelAndView;
    }
    @PostMapping
    public ModelAndView addCourse(@ModelAttribute Course course){
        ModelAndView modelAndView=new ModelAndView();
        courseList.add(course);
        modelAndView.setViewName("courselist");
        modelAndView.addObject("CourseList",getAllCourses());
        return modelAndView;

    }


    public static List<Course> findCourseByID(int courseId){

        List<Course> list = courseList.stream().filter(course -> course.getCourseId() == courseId).toList();
        return list;
    }
}
