package com.example.trainTicketManagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(TrainNotFoundException.class)
    public ResponseEntity<?>trainNotFound(TrainNotFoundException trainNotFoundException){
        List<String> details = new ArrayList<>();
        ExceptionResponse exceptionResponse = new ExceptionResponse("Searched train not found !", details);
        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
}
