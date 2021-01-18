package com.example.carproposalmicroservicewithfeign.infra.dto;

import lombok.Data;

@Data
public class User {
    private final String name;
    private final String lovedCar;
}
