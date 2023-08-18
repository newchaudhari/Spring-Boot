package com.navin.springbootrest03.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "course")
public class Course {
    @Id
    @Column(name = "id")
    private Integer courseId;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "price")
    private Integer coursePrice;
}
