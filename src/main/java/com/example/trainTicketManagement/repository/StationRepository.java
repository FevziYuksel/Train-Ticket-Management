package com.example.trainTicketManagement.repository;

import com.example.trainTicketManagement.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station,Integer> {

}
