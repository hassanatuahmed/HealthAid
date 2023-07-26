package com.springboot.healthaidservice.dto;

import com.springboot.healthaidservice.model.Hospital;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
public class DoctorDto {
    private UUID id;
    private String name;
    private String contact;
    private String email;
    private String address;
    private String reviewer;
    private Set<Hospital> hospitals;
}
