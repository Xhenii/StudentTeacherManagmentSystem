package com.sda.al.ManagementSystemStudentTeacher.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity
@Table(name = "Enroll_table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Enroll {

    @Id
    @Column(name = "id")
    private Long id;

    private String description;

    //mund ta kisha bere edhe enum
    @Column(name = "Grade",nullable = false)
    private int grade;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;





    @ManyToOne
    @JoinColumn(name = "Course_id")
    private Course course;










}
