package com.navin.springbootdatajpa02;

import com.navin.springbootdatajpa02.controller.CourseController;
import com.navin.springbootdatajpa02.model.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDataJpa02Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataJpa02Application.class, args);
        CourseController courseController = context.getBean(CourseController.class);

/*        System.out.println("Delete from course");
        courseController.deleteById(23);*/

        System.out.println("\n"+"\n"+"\n");
        System.out.println(courseController.findByCourseId(55));
        System.out.println("\n"+"\n"+"\n");
        for (Course course:courseController.getAllCourses()) {
            System.out.println(course);
        }
        System.out.println("\n"+"\n"+"\n");
        for (Course course : courseController.findByCourseName("mean")) {
            System.out.println(course);
        }
        System.out.println("\n"+"\n"+"\n");

        courseController.addCourse(new Course(56,"Java",37000));
        System.out.println("course added");


    }

}
