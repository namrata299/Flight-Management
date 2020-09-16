package com.example.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.application.entities.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
