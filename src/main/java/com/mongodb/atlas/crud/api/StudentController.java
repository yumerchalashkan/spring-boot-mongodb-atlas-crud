package com.mongodb.atlas.crud.api;

import com.mongodb.atlas.crud.dto.requests.StudentRequest;
import com.mongodb.atlas.crud.dto.responses.StudentResponse;
import com.mongodb.atlas.crud.entity.Student;
import com.mongodb.atlas.crud.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<StudentResponse> getAll(){
        return studentService.findStudents();
    }


    @PostMapping
    public Student save(@RequestBody StudentRequest studentRequest){
        return studentService.save(studentRequest);
    }

    @GetMapping("/{id}")
    public StudentResponse getById(@PathVariable("id") String id) throws Exception{
        return studentService.findById(id);
    }

}
