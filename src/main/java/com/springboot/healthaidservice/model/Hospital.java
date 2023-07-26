package com.springboot.healthaidservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
import java.util.UUID;
@Entity
@Data
@Table(name = "hospitals")
public class Hospital {
    @Id
    @GeneratedValue
    private UUID id;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String email;
    @Column
    private String contact;
    @Column
    private String type;
    @Column
    private String reviewer;
    @OneToMany(mappedBy = "doctors", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Doctor> doctors;

}
