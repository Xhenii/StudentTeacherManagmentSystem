package com.sda.al.ManagementSystemStudentTeacher.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class EnrollModel {

    private Long id;

    private String description;

    private int grade;

    public EnrollModel(Long id, String description, int grade) {
        this.id = id;
        this.description = description;
        this.grade = grade;
    }
}
