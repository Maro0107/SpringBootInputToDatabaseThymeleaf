package com.example.restAPI.repository;


import com.example.restAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<User, Long> {
}
