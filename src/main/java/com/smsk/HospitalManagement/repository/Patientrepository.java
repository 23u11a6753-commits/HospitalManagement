package com.smsk.HospitalManagement.repository;

import com.smsk.HospitalManagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Patientrepository extends JpaRepository<Patient,Long> {
}