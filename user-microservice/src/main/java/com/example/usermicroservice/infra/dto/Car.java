package com.example.usermicroservice.infra.dto;

import lombok.Data;

@Data
public class Car {
    private final String company;
    private final String model;
    private final String engine;
}
