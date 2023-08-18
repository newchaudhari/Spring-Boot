package com.navin.springboot01;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Course {
    private int courseId;
    private String courseName;
    private int coursePrice;
}
