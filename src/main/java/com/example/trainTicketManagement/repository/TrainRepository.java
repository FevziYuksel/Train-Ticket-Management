package com.example.trainTicketManagement.repository;

import com.example.trainTicketManagement.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TrainRepository extends JpaRepository<Train, Integer> {

}
