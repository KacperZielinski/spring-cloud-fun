package com.example.usermicroservice;

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
                new User("Piotr", "Peugeot"),
                new User("Kasia", "Citroen"),
                new User("Czesław", "Volkswagen")
        );
    }
}
