package com.example.carproposalmicroservicewithfeign.infra.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarProposal {
    private User user;
    private Car car;
}
