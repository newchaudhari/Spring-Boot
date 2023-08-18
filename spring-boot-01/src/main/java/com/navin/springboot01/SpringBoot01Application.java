package com.navin.springboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot01Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBoot01Application.class, args);
        Dao dao = context.getBean(Dao.class);
        for (Course course : dao.getAllCourses()) {
            System.out.println(course + "\n");
        }
        addCourse(dao);

//        updateCourse(dao);
//
//        deleteCourse(dao);
    }

    private static void deleteCourse(Dao dao) {
        dao.deleteCourseById(26);
        System.out.println("deleted");
    }

    private static void updateCourse(Dao dao) {
        Course course = new Course();
        course.setCourseId(26);
        course.setCourseName("C++");
        course.setCoursePrice(5200);
        dao.updateCourse(course);
        System.out.println("course updated");
    }

    private static void addCourse(Dao dao) {
        Course course = new Course(26, "Spring", 8000);
        dao.addCourse(course);
        System.out.println("Course Added Successfully");
    }


}
