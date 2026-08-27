package com.homas.hospital_ms.service;

import com.homas.hospital_ms.model.Patient;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class PatientService {

    private final List<Patient> patients = new ArrayList<>();
    public PatientService() {
        patients.add(
                new Patient(1L, "John Doe", "john.doe@example.com", "123-456-7890"));
        patients.add(
                new Patient(2L, "Jane Smith", "jane.smith@example.com", "098-765-4321"));
    }

    public Patient getPatientById(Long id) {

        for (Patient patient : patients) {
            if (id.equals(patient.getId())) {
                return patient;
            }
        }
        return null;
    }

    }
