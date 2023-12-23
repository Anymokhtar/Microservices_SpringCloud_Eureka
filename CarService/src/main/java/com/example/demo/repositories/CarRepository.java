package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
}