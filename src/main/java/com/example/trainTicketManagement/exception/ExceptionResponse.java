package com.example.trainTicketManagement.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ExceptionResponse {
    private String message;
    private List<String> details;
}
