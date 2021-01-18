package com.example.carproposalmicroservicewithfeign;

import com.example.carproposalmicroservicewithfeign.infra.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("user")
public interface UserClient {

    @GetMapping
    List<User> getAllUsers();
}
