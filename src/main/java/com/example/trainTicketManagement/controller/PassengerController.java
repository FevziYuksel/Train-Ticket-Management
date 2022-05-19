package com.example.trainTicketManagement.controller;

import com.example.trainTicketManagement.model.Passenger;
import com.example.trainTicketManagement.service.TrainTicketService;
import com.example.trainTicketManagement.service.TrainService;
import com.example.trainTicketManagement.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("train-booking/passenger")
public class PassengerController {

    private final TrainService trainService;
    private final PassengerService passengerService;
    private final TrainTicketService trainTicketService;
    @Autowired
    public PassengerController(TrainService trainService, PassengerService passengerService, TrainTicketService trainTicketService) {
        this.trainService = trainService;
        this.passengerService = passengerService;
        this.trainTicketService = trainTicketService;
    }

    @GetMapping
    public ResponseEntity<List<Passenger>> getALlPassengers(){
        return new ResponseEntity<>(passengerService.getAllPassenger(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger passenger){
        return new ResponseEntity<>(passengerService.savePassenger(passenger), HttpStatus.OK);
    }

}
