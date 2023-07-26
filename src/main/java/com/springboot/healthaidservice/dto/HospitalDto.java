package com.springboot.healthaidservice.dto;

import java.util.Set;
import java.util.UUID;

public class HospitalDto {
    private UUID id;
    private String name;
    private String address;
    private String email;
    private String contact;
    private String type;
    private String reviewer;
    private Set<DoctorDto> doctors;
}
