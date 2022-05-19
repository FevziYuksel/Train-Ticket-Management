package com.example.trainTicketManagement.service;

import com.example.trainTicketManagement.model.Train;
import com.example.trainTicketManagement.repository.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainService {

    private final TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository){
        this.trainRepository = trainRepository;
    }

    public Train createFlight(Train train){
        return trainRepository.save(train);
    }

    public List<Train> getALlTrains(){
        List<Train> temp = new ArrayList<>();
        List<Train> trains = trainRepository.findAll();
        for(Train f : trains){
            if(f.getAvailableSeats() > 0){
                temp.add(f);
            }
        }
        return  temp;
    }


    public void updateSeatNumber(Train chosenTrain){
        trainRepository.save(chosenTrain);
    }

}
