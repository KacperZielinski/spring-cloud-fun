package com.example.carmicroservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarRestController {

    @GetMapping
    public List<Car> getAllCars() {
        return Arrays.asList(
                new Car("Peugeot", "406", "2.0 16V 135km"),
                new Car("Citroen", "C5", "1.6 HDi"),
                new Car("Volkswagen", "Passat", "1.9 TDI")
        );
    }
}
