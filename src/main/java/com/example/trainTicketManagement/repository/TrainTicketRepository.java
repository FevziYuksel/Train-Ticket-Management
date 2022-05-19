package com.example.trainTicketManagement.repository;

import com.example.trainTicketManagement.model.TrainTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainTicketRepository extends JpaRepository<TrainTicket,Integer> {
}
