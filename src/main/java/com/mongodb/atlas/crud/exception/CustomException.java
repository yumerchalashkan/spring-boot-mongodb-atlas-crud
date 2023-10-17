package com.mongodb.atlas.crud.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class CustomException {
    private String exceptionPath;
    private LocalDateTime localDateTime;
    private String exceptionMessage;
}
