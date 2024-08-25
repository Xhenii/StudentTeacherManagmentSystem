package com.sda.al.ManagementSystemStudentTeacher.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Base {
    @Id
    @Column(name = "id")
    private Long ID;
}
