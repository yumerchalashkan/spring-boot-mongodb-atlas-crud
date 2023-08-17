package com.mongodb.atlas.crud.service;

import com.mongodb.atlas.crud.dto.requests.StudentRequest;
import com.mongodb.atlas.crud.dto.responses.StudentResponse;
import com.mongodb.atlas.crud.entity.Student;

import java.util.List;

public interface StudentService {

    List<StudentResponse> findStudents();

    StudentResponse findById(String id) throws Exception;
    Student save(StudentRequest studentRequest);

}
