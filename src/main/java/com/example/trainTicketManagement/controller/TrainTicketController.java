package com.example.trainTicketManagement.controller;

import com.example.trainTicketManagement.model.TrainTicket;
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
@RequestMapping("train-booking/train-ticket")
public class TrainTicketController {

    private final TrainService trainService;
    private final PassengerService passengerService;
    private final TrainTicketService trainTicketService;

    @Autowired
    public TrainTicketController(PassengerService passengerService, TrainService trainService, TrainTicketService trainTicketService) {
        this.passengerService = passengerService;
        this.trainService = trainService;
        this.trainTicketService = trainTicketService;
    }
    @GetMapping
    public ResponseEntity<List<TrainTicket>>getAllTrainTickets(){
        return new ResponseEntity<>(trainTicketService.getAllTrainTickets(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TrainTicket> createTrainTicket(@RequestBody List<Passenger> passengers, @RequestParam("id") Integer trainNumber){ // @RequestParam(defaultValue= "1790")
        //Parameter somewhat works
        System.out.println(trainNumber);
        return new ResponseEntity<>(trainTicketService.createTrainTicket(passengers,trainNumber), HttpStatus.OK);
    }



}
