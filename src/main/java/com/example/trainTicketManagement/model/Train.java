package com.example.trainTicketManagement.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;



@Data
@Builder
@Entity(name = "Train")
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer trainNumber;
    private String trainClass;
    private String fromStation;
    private String toStation;
    private Integer availableSeats;
    private Integer fare;
    private LocalDate doj;

    public Train(Integer trainNumber, String trainClass, String fromStation, String toStation, Integer availableSeats, Integer fare, LocalDate doj) {
        this.trainNumber = trainNumber;
        this.trainClass = trainClass;
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.availableSeats = availableSeats;
        this.fare = fare;
        this.doj = doj;

    }

}







