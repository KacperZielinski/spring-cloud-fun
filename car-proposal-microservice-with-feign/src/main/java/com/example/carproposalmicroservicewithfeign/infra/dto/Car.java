package com.example.carproposalmicroservicewithfeign.infra.dto;

import lombok.Data;

@Data
public class Car {
    private String company;
    private String model;
    private String engine;
}
