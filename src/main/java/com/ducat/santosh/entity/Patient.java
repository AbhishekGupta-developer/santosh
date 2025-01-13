package com.ducat.santosh.entity;

import com.ducat.santosh.enums.PatientSymptom;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "patient")
@Data
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String city;
    private String email;
    private String phone;

    @Enumerated(EnumType.STRING)
    private PatientSymptom symptom;

}
