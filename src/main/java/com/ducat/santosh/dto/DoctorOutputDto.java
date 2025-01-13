package com.ducat.santosh.dto;

import com.ducat.santosh.enums.DoctorCity;
import com.ducat.santosh.enums.DoctorSpeciality;
import lombok.Data;

@Data
public class DoctorOutputDto {
    private Long id;
    private String name;
    private DoctorCity city;
    private String email;
    private String phone;
    private DoctorSpeciality speciality;
}
