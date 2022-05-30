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
    private Long id;

    private String passengerName;
    private Integer passengerAge;
    private FoodChoice foodChoice;

    public Passenger(String passengerName, Integer passengerAge, FoodChoice foodChoice) {
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.foodChoice = foodChoice;
    }
}

