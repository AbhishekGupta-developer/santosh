package com.ducat.santosh.dto;

import com.ducat.santosh.enums.DoctorCity;
import com.ducat.santosh.enums.DoctorSpeciality;
import lombok.Data;

@Data
public class DoctorInputDto {
    private String name;
    private DoctorCity city;
    private String email;
    private String phone;
    private DoctorSpeciality speciality;
}
