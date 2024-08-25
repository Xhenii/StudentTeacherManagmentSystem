package com.sda.al.ManagementSystemStudentTeacher.service;

import com.sda.al.ManagementSystemStudentTeacher.entity.Enroll;
import com.sda.al.ManagementSystemStudentTeacher.exeptions.NotFound;
import com.sda.al.ManagementSystemStudentTeacher.repository.EnrollRepo;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class EnrollService {
    private final EnrollRepo repo;
    public List<Enroll> findGradeById(Long id)
    {
        return repo.findGradeById(id);
    }

    public List<Enroll> getAllEnrolledCourses() {
        return repo.findAll();
    }
    public void delete(Long id) {
        repo.delete(findGradeById(id).orElseThrow(() -> new NotFound("Cannot find this user!")));
    }
}
