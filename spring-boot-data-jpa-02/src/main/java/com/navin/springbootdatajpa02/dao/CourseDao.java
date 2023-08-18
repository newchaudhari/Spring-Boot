package com.navin.springbootdatajpa02.dao;

import com.navin.springbootdatajpa02.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CourseDao extends CrudRepository<Course, Integer> {
    Course findByCourseId(int courseId);
    List<Course> findByCourseNameContainingIgnoreCase(String courseName);

}
