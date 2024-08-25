package com.sda.al.ManagementSystemStudentTeacher.entity;

import com.sda.al.ManagementSystemStudentTeacher.enums.CourseStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Course_table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Course {

    @Id
    @Column(name = "id")
    private Long id;


    @Column(name = "Course_name",nullable = false)
    private String name;

    @Column(name = "Course_description")
    private String description;

    @Enumerated
    @Column(name = "Course_Status",nullable = false)
    private CourseStatus courseStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



}
