package com.ducat.santosh.repository;

import com.ducat.santosh.entity.Doctor;
import com.ducat.santosh.enums.DoctorCity;
import com.ducat.santosh.enums.DoctorSpeciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findByCityAndSpeciality(DoctorCity doctorCity, DoctorSpeciality doctorSpeciality);
}
