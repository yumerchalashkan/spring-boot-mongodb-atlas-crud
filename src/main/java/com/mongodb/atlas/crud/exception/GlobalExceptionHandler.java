package com.mongodb.atlas.crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.Servlet;
import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<CustomException> handler(Exception exception, WebRequest webRequest){
        CustomException customException = CustomException.builder()
                .exceptionPath(((ServletWebRequest) webRequest).getRequest().getRequestURI())
                .exceptionMessage(exception.getMessage())
                .localDateTime(LocalDateTime.now())
                .build();

        return new ResponseEntity<CustomException>(customException,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
