package com.ducat.santosh.service;

import com.ducat.santosh.dto.DoctorInputDto;
import com.ducat.santosh.dto.DoctorOutputDto;

import java.util.List;

public interface DoctorService {
    DoctorOutputDto getDoctor(Long id);
    List<DoctorOutputDto> getAllDoctors();
    DoctorOutputDto addDoctor(DoctorInputDto doctorInputDto);
    DoctorOutputDto updateDoctor(Long id, DoctorInputDto doctorInputDto);
    String removeDoctor(Long id);
}
