package com.example.trainTicketManagement.controller;

import com.example.trainTicketManagement.model.Train;
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
@RequestMapping("/v1/train-booking/train")
public class TrainController {

    private final TrainService trainService;
    private final PassengerService passengerService;
    private final TrainTicketService trainTicketService;

    @Autowired
    public TrainController(TrainService trainService, PassengerService passengerService, TrainTicketService trainTicketService) {
        this.trainService = trainService;
        this.passengerService = passengerService;
        this.trainTicketService = trainTicketService;
    }

    @GetMapping
    public ResponseEntity<List<Train>> getALlTrains(){
        return new ResponseEntity<>(trainService.getALlTrains(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Train> createFlight(@RequestBody Train train){
        return new ResponseEntity<>(trainService.createFlight(train), HttpStatus.OK);
    }

}
