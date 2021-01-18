package com.example.usermicroservice.infra.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Car {
    private final String company;
    private String model;
    private String engine;
}
