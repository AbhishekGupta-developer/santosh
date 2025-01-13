package com.ducat.santosh.service;

import com.ducat.santosh.dto.DoctorOutputDto;
import com.ducat.santosh.dto.PatientInputDto;
import com.ducat.santosh.dto.PatientOutputDto;

import java.util.List;

public interface PatientService {
    PatientOutputDto getPatient(Long id);
    List<PatientOutputDto> getAllPatients();
    PatientOutputDto addPatient(PatientInputDto patientInputDto);
    PatientOutputDto updatePatient(Long id, PatientInputDto patientInputDto);
    String removePatient(Long id);
    List<DoctorOutputDto> suggestDoctors(Long patientId);
}
