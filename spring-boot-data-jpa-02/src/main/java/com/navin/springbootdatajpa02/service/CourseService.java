package com.navin.springbootdatajpa02.service;

import com.navin.springbootdatajpa02.dao.CourseDao;
import com.navin.springbootdatajpa02.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;

    public List<Course> getAllCourse(){
        return (List<Course>) courseDao.findAll();
    }

    public void deleteById(int courseId){
        courseDao.deleteById(courseId);
    }

    public Course findByCourseId(int courseId){
        return courseDao.findByCourseId(courseId);
    }

    public List<Course> findByCourseName(String courseName){
        return courseDao.findByCourseNameContainingIgnoreCase(courseName);
    }

    public void addCourse(Course course){
        courseDao.save(course);
    }

}
