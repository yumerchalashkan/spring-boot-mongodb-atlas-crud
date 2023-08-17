package com.mongodb.atlas.crud.service;

import com.mongodb.atlas.crud.dto.requests.StudentRequest;
import com.mongodb.atlas.crud.dto.responses.StudentResponse;
import com.mongodb.atlas.crud.entity.Student;
import com.mongodb.atlas.crud.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    @Override
    public List<StudentResponse> findStudents() {
        List<Student> lists = studentRepository.findAll();
        return lists.stream().map(x -> new StudentResponse(x.getName(), x.getSurname())).collect(Collectors.toList());
    }

    @Override
    public StudentResponse findById(String id) throws Exception {
        Student student = studentRepository.findById(id).orElseThrow(()->new Exception("User Not Found"));
        return new StudentResponse(student.getName(), student.getSurname());
    }

    @Override
    public Student save(StudentRequest studentRequest) {
        return studentRepository.save(new Student(studentRequest.getName(), studentRequest.getSurname()));
    }
}
