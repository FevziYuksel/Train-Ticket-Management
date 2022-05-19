package com.example.trainTicketManagement.repository;

import com.example.trainTicketManagement.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
}