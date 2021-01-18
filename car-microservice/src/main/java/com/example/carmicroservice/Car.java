package com.example.carmicroservice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String company;
    private String model;
    private String engine;
}
