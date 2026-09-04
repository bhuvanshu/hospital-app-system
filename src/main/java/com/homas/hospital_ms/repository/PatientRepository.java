package com.homas.hospital_ms.repository;

import com.homas.hospital_ms.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}