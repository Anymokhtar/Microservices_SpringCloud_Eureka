package com.example.demo.services;

import java.util.List;

import com.example.demo.model.CarResponse;

public interface CarService {
    List<CarResponse> findAll();
    CarResponse findById(Long id) throws Exception;
    void save(CarResponse car);
    void delete(Long id) throws Exception;

    void update(CarResponse carResponse, Long id) throws Exception;
}