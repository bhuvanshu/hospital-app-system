package com.homas.hospital_ms.controller;

import com.homas.hospital_ms.model.Patient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @GetMapping("/{id}")
    public Patient getPatient(@PathVariable Long id){
        return new Patient(id, "John Doe", "john.doe@example.com", "123-456-7890");


    }

}
