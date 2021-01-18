package com.example.carproposalmicroservicewithfeign;

import com.example.carproposalmicroservicewithfeign.infra.dto.Car;
import com.example.carproposalmicroservicewithfeign.infra.dto.CarProposal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("car-proposal")
public class CarProposalRestController {

    private CarClient carClient;
    private UserClient userClient;

    public CarProposalRestController(CarClient carClient, UserClient userClient) {
        this.carClient = carClient;
        this.userClient = userClient;
    }

    @GetMapping
    public List<CarProposal> getProposals() {
        List<Car> cars = carClient.getAllCars();
        List<CarProposal> carProposals = new ArrayList<>();

        userClient.getAllUsers()
                .forEach(user -> cars.stream()
                    .filter(car -> car.getCompany().equals(user.getLovedCar()))
                    .findFirst()
                    .ifPresent(car -> carProposals.add(new CarProposal(user, car))));

        return carProposals;
    }
}
