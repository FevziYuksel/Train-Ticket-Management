package com.example.trainTicketManagement.service;

import com.example.trainTicketManagement.model.Passenger;
import com.example.trainTicketManagement.repository.PassengerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    private final PassengerRepository passengerRepository;

    public PassengerService(PassengerRepository passengerRepository){
        this.passengerRepository = passengerRepository;
    }

    public Passenger savePassenger(Passenger passenger ){
        return passengerRepository.save(passenger);
    }

    public List<Passenger> getAllPassenger(){
        return passengerRepository.findAll();
    }
}
