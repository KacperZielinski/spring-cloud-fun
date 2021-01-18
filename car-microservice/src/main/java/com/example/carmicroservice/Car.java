package com.example.carmicroservice;

import lombok.Data;

@Data
public class Car {
    private final String company;
    private final String model;
    private final String engine;
}
