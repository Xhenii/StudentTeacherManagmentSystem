package com.sda.al.ManagementSystemStudentTeacher.repository;

import com.sda.al.ManagementSystemStudentTeacher.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course ,Long> {




}
