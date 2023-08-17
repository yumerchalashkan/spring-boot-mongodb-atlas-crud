package com.mongodb.atlas.crud.repository;

import com.mongodb.atlas.crud.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {
}
