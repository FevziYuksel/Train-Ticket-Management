package com.example.trainTicketManagement.config;

import com.example.trainTicketManagement.model.Passenger;
import com.example.trainTicketManagement.model.Train;
import com.example.trainTicketManagement.repository.TrainRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
@Configuration
public class TrainConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            TrainRepository trainRepository

    ){
        return args -> {

            List <Train> allTrains = new LinkedList<>();

            allTrains. add(new Train(7511, "Economy","Istanbul",
                    "Izmir",304, 936, LocalDate.now().plusDays(4)));

            allTrains. add(new Train(7511, "Business","Istanbul",
                    "Izmir",42, 1688 , LocalDate.now().plusDays(4)));

            allTrains. add(new Train(1790, "Economy","Istanbul",
                    "Baku",304, 2607 , LocalDate.parse("2022-04-29")));

            allTrains. add(new Train(1790, "Business","Istanbul",
                    "Baku",42, 9566 , LocalDate.parse("2022-04-29")));

            allTrains. add(new Train(1531, "Economy","Munich",
                    "Ankara",304, 2305, LocalDate.now()));

            allTrains. add(new Train(1531, "Business","Munich",
                    "Ankara",42, 8940, LocalDate.now()));


            trainRepository.saveAll(allTrains);

        };
    }
}
