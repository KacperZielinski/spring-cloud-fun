package com.example.usermicroservice;

import com.example.usermicroservice.infra.dto.Car;
import lombok.Data;

@Data
public class User {
    private final String name;
    private final Car car;
}
