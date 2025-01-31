package com.ducat.santosh.repository;

import com.ducat.santosh.entity.Doctor;
import com.ducat.santosh.enums.DoctorCity;
import com.ducat.santosh.enums.DoctorSpeciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findByCityAndSpeciality(DoctorCity doctorCity, DoctorSpeciality doctorSpeciality);

    //JPQL
    @Query("SELECT d FROM Doctor d WHERE d.email = :email")
    Doctor findByEmail(@Param("email") String email);

    //Native SQL Query
    @Query(value = "SELECT * FROM doctor WHERE name LIKE %:name%", nativeQuery = true)
    List<Doctor> findByNameLike(@Param("name") String name);
}
