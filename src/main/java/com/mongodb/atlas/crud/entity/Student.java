package com.mongodb.atlas.crud.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
@Data
public class Student {

    @Id
    private String id;

    private String name;

    private String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
