package com.navin.springbootrest03.service;

import com.navin.springbootrest03.dao.CourseDao;
import com.navin.springbootrest03.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;

    public List<Course> findAllCourse() {
        return courseDao.findAll();
    }


    public Course findByCourseId(Integer courseId) {
        return courseDao.findById(courseId).get();
    }


    public void deleteByCourseId(Integer courseId) {
        Course course = courseDao.findById(courseId).get();

        courseDao.delete(course);

    }

    public void addCourse(Course course) {
        courseDao.save(course);
    }
}
