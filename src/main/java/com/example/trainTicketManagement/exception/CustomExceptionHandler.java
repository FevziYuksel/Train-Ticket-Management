package com.example.trainTicketManagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class CustomExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(TrainNotFoundException.class)
    public ResponseEntity<?>trainNotFoundException(TrainNotFoundException trainNotFoundException){
        List<String> details = new ArrayList<>();
        ExceptionResponse exceptionResponse = new ExceptionResponse("Searched train not found !", details, LocalDate.now());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }
}
