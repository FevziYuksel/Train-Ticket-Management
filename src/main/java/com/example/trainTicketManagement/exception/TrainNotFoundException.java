package com.example.trainTicketManagement.exception;

public class TrainNotFoundException extends RuntimeException {

    public TrainNotFoundException(String message){
        super(message);
    }
}
