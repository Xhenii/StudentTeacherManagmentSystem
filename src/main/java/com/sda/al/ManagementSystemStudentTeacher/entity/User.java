package com.sda.al.ManagementSystemStudentTeacher.entity;

import com.sda.al.ManagementSystemStudentTeacher.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
@Entity
@Table(name = "User_table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @Column(name = "id")
    private Long id;


    @Column(name = "User_name",nullable = false )
    private String username;

    @Column(name = "User_Last Name",nullable = false)
    private String lastName;

    @Column(name = "User_birthday",nullable = false)
    private LocalDate birthday;


    @Column(name = "Password",nullable = false)
    private String password;

    @Column(name = "User_email",nullable = false,unique = true)
    private String email;


    @Column(name = "Role",nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;




}
