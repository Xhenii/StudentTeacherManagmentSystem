package com.sda.al.ManagementSystemStudentTeacher.repository;

import com.sda.al.ManagementSystemStudentTeacher.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    List<User> findAllByUsername(String username);


    Optional<User> findUserById(Long id);

    Optional<User>findUserByEmail(String email);




}
