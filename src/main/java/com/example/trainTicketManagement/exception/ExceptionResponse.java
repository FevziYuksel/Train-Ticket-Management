package com.example.trainTicketManagement.exception;


import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {

    private String message;
    private List<String> details;
    private LocalDate timeStamp;

}
