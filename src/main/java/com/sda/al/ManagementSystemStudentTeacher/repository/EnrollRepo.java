package com.sda.al.ManagementSystemStudentTeacher.repository;

import com.sda.al.ManagementSystemStudentTeacher.entity.Enroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EnrollRepo extends JpaRepository<Enroll,Long> {


    List<Enroll> findGradeById(Long id);

    List<Enroll>  getAllEnrolledCourses();

    List<Enroll>  delete(Long id);

}

