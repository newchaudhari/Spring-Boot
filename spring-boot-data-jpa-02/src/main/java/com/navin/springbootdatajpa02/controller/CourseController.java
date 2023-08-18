package com.navin.springbootdatajpa02.controller;

import com.navin.springbootdatajpa02.model.Course;
import com.navin.springbootdatajpa02.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CourseController {
    @Autowired
    CourseService courseService;
    public List<Course> getAllCourses(){
        return courseService.getAllCourse();
    }
    public void deleteById(int courseId){
        courseService.deleteById(courseId);
    }
    public Course findByCourseId(int courseId){
        return courseService.findByCourseId(courseId);
    }
    public List<Course> findByCourseName(String courseName){
        return courseService.findByCourseName(courseName);
    }
    public void addCourse(Course course){
        courseService.addCourse(course);
    }


}
