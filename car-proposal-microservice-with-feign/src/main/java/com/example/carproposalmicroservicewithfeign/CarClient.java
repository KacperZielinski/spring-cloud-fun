package com.example.carproposalmicroservicewithfeign;

import com.example.carproposalmicroservicewithfeign.infra.dto.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "car")
public interface CarClient {

    @GetMapping("/car")
    List<Car> getAllCars();
}
