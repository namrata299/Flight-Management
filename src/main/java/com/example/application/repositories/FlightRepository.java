package com.example.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.application.entities.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

}
