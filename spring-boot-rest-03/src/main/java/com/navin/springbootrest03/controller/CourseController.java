package com.navin.springbootrest03.controller;

import com.navin.springbootrest03.model.Course;
import com.navin.springbootrest03.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping
    public List<Course> findAllCourse() {
        return courseService.findAllCourse();
    }

    @GetMapping("{courseId}")
    public Course findByCourseId(@PathVariable Integer courseId) {

        return courseService.findByCourseId(courseId);
    }

    @DeleteMapping("{courseId}")
    public String deleteByCourseId(@PathVariable Integer courseId) {

        try {
            courseService.deleteByCourseId(courseId);
        } catch (NoSuchElementException noSuchElementException) {
            return ("course is not present");
        }
        return "course deleted successfully";
    }

    @PostMapping
    public String addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
        return "Course added Successfully";
    }
}
