package com.smsk.HospitalManagement.service;

import com.smsk.HospitalManagement.entity.Patient;
import com.smsk.HospitalManagement.repository.Patientrepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Patientser{

    private final Patientrepository Ser;
    public Patient getbyId(Long id){
        return Ser.findById(id).orElseThrow(()-> new RuntimeException("id is not found"));
    }

    public List<Patient> getall(){
        return Ser.findAll();
    }
    public Patient add(Patient data){
        return Ser.save(data);
    }
    public Patient update(Long id,Patient new_data) {
        Patient old_id = Ser.findById(id).orElseThrow(() -> new RuntimeException("id not found"));
        old_id.setName(new_data.getName());
        old_id.setAadhar_no(new_data.getAadhar_no());
        old_id.setAge(new_data.getAge());
        old_id.setBloodGroup((new_data.getBloodGroup()));
        old_id.setEmail(new_data.getEmail());
        old_id.setGender(new_data.getGender());
        old_id.setNumber(new_data.getNumber());
        old_id.setPatientCode(new_data.getPatientCode());
        return Ser.save(old_id);
    }
    public void delete(Long id){
        Ser.deleteById(id);
        System.out.println("id has been deleted"+id);
    }

}