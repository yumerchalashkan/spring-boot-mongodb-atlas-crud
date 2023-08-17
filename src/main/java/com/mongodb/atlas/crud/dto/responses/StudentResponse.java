package com.mongodb.atlas.crud.dto.responses;

import lombok.Data;

@Data
public class StudentResponse {
    private String name;
    private String surname;

    public StudentResponse(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
