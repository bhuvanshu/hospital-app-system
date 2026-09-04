package com.homas.hospital_ms.service;

import com.homas.hospital_ms.model.Patient;
import com.homas.hospital_ms.repository.PatientRepository;
import org.springframework.stereotype.Service;


@Service
public class PatientService {

    private final PatientRepository patientRepository;
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;

            }
    public Patient getPatientById(Long id) {

        return patientRepository.findById(id).orElse(null);
    }
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }
        }