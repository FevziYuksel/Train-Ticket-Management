package com.example.trainTicketManagement.model;

import lombok.*;

import javax.persistence.*;


@Data
@Builder
@Entity(name = "Passenger")
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String passengerName;
    private Integer passengerAge;
    private Integer foodChoice;

    public Passenger(String passengerName, Integer passengerAge, Integer foodChoice) {
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.foodChoice = foodChoice;
    }
}

