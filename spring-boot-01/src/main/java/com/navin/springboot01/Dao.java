package com.navin.springboot01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Dao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Course> getAllCourses() {
        String sql = "SELECT * FROM course";
        RowMapper<Course> rowMapper = (resultSet, rowNum) -> {
            Course course = new Course(resultSet.getInt("id"), resultSet.getString("courseName"), resultSet.getInt("price"));
            return course;
        };

        return jdbcTemplate.query(sql, rowMapper);
    }

    public void addCourse(Course course) {
        String query = "INSERT INTO course (id, courseName, price) values(?,?,?)";
        jdbcTemplate.update(query, course.getCourseId(), course.getCourseName(), course.getCoursePrice());
    }

    public void updateCourse(Course course) {
        String query = "UPDATE course SET courseName=?,price=? WHERE id=?";
        jdbcTemplate.update(query, course.getCourseName(), course.getCoursePrice(), course.getCourseId());
    }

    public void deleteCourseById(int courseId) {
        String query = "DELETE FROM course WHERE id=?";
        jdbcTemplate.update(query, courseId);
    }
}
