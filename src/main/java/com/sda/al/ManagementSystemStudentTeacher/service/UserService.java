package com.sda.al.ManagementSystemStudentTeacher.service;

import com.sda.al.ManagementSystemStudentTeacher.entity.User;
import com.sda.al.ManagementSystemStudentTeacher.enums.Role;
import com.sda.al.ManagementSystemStudentTeacher.exeptions.NotFound;
import com.sda.al.ManagementSystemStudentTeacher.repository.UserRepo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class UserService {
    private final UserRepo repo;
    public Optional<User> findUserById(Long id)
    {
        return repo.findById(id);
    }
    public Optional<User> findByEmail(String email) {
        return repo.findUserByEmail(email);
    }

    public User save(User entity) {
        return repo.save(entity);
    }

    public void delete(Long id) {
        repo.delete(findUserById(id).orElseThrow(() -> new NotFound("Cannot find this user!")));
    }
    public List<User> getAll() {
        return repo.findAll();
    }
    public List<User> getAllByFirstName(String username) {
        return repo.findAllByUsername(username);
    }




}
