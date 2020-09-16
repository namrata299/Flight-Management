package com.example.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.application.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
