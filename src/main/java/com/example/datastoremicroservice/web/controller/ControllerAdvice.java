package com.example.datastoremicroservice.web.controller;

import com.example.datastoremicroservice.model.exception.SensorNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(SensorNotFoundException.class)
    public String sensorNotFoundExceptionHandler(SensorNotFoundException e) {
        return "Sensor Not Found";
    }

    @ExceptionHandler(Exception.class)
    public String server(Exception e) {
        e.printStackTrace();
        return "Server Error";
    }

}
