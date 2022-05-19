package com.example.trainTicketManagement.config;
import com.example.trainTicketManagement.model.Passenger;
import com.example.trainTicketManagement.repository.PassengerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.LinkedList;
import java.util.List;

@Configuration
public class PassengerConfig {


    @Bean
    CommandLineRunner commandLineRunner(
            PassengerRepository passengerRepository
    ){
        return args -> {


            List<Passenger> allPassensers = new LinkedList<>();
            allPassensers.add(new Passenger("Mehmet",22,2));

            passengerRepository.saveAll(allPassensers);
        };
    }
}

