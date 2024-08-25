package com.sda.al.ManagementSystemStudentTeacher.mapper;

import com.sda.al.ManagementSystemStudentTeacher.entity.Enroll;
import com.sda.al.ManagementSystemStudentTeacher.model.EnrollModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EnrollMapper {


    public Enroll toModel(Enroll entity) {
        if (entity == null) {
            return null;
        }

        return new EnrollModel(entity.getId(), entity.getDescription(),
                entity.getGrade());
    }

    public Enroll toEntity(EnrollModel model) {
        if (model == null) {
            return null;
        }
        return new EnrollModel(model.getId(),
                model.getDescription(), model.getGrade());
    }
}


