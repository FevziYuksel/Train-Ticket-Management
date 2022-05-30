package com.example.trainTicketManagement.config;
import com.example.trainTicketManagement.model.FoodChoice;
import com.example.trainTicketManagement.model.Passenger;
import com.example.trainTicketManagement.repository.PassengerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.LinkedList;
import java.util.List;

//Doesn't work fix it
public class PassengerConfig {


    @Bean
    CommandLineRunner commandLineRunner(
            PassengerRepository passengerRepository
    ){
        return args -> {


            List<Passenger> allPassensers = new LinkedList<>();
            allPassensers.add(new Passenger("Mehmet",22, FoodChoice.NORMAL));

            passengerRepository.saveAll(allPassensers);
        };
    }
}

