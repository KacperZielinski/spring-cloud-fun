package com.example.carproposalmicroservicewithfeign.infra.dto;

import lombok.Data;

@Data
public class CarProposal {
    private final User user;
    private final Car car;
}
