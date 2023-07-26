package com.springboot.healthaidservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
import java.util.UUID;
@Entity
@Data
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue
    private UUID id;
    @Column
    private String name;
    @Column
    private String contact;
    @Column
    private String email;
    @Column
    private String address;
    @Column
    private String reviewer;
    @OneToMany(mappedBy = "hospitals", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Hospital> hospitals;
}
