package com.example.usermicroservice;

import com.example.usermicroservice.infra.dto.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {

    @GetMapping
    public List<User> getAllUsers() {
        return Arrays.asList(
                new User("Piotr", new Car("Peugeot")),
                new User("Kasia", new Car("Citroen")),
                new User("Czesław", new Car("Volkswagen"))
        );
    }
}
