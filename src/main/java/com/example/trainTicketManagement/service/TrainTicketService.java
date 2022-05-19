package com.example.trainTicketManagement.service;

import com.example.trainTicketManagement.exception.TrainNotFoundException;
import com.example.trainTicketManagement.model.TrainTicket;
import com.example.trainTicketManagement.model.Train;
import com.example.trainTicketManagement.model.Passenger;
import com.example.trainTicketManagement.repository.TrainTicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class TrainTicketService {


    private final TrainTicketRepository trainTicketRepository;
    private final TrainService trainService;
    private final PassengerService passengerService;

    public TrainTicketService(TrainTicketRepository trainTicketRepository, TrainService trainService, PassengerService passengerService) {
        this.trainTicketRepository = trainTicketRepository;
        this.trainService = trainService;
        this.passengerService = passengerService;
    }
    public TrainTicket createTrainTicket(List<Passenger> passengers , Integer trainNumber){


        Train chosenTrain = new Train();
        List<Train> chosenTrains = trainService.getALlTrains();

        for(Train f : chosenTrains){
            if(Objects.equals(f.getTrainNumber(), trainNumber)){
                chosenTrain = f;
            }
            //Logical error : when if numbers don't match , it throws error
            //else throw new TrainNotFoundException("Searched train cannot found !");
        }
        if(chosenTrain.getId() == null) throw new TrainNotFoundException("Searched train cannot found !");
        System.out.println(chosenTrain);
        System.out.println(chosenTrain.getId());

        //This code doesn't work replace train
        chosenTrain.setTrainNumber(chosenTrain.getTrainNumber()-passengers.size());


        TrainTicket trainTicket = new TrainTicket(passengers, chosenTrain);

        trainTicket.setId(trainTicketRepository.findAll().size()+1);

        trainService.updateSeatNumber(chosenTrain);

        return trainTicketRepository.save(trainTicket);

    }

    public List<TrainTicket> getAllTrainTickets(){

        return trainTicketRepository.findAll();
    }

}
