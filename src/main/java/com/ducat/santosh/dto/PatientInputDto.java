package com.ducat.santosh.dto;

import com.ducat.santosh.enums.PatientSymptom;
import lombok.Data;

@Data
public class PatientInputDto {
    private String name;
    private String city;
    private String email;
    private String phone;
    private PatientSymptom symptom;
}
