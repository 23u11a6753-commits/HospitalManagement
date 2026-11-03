package com.smsk.HospitalManagement.controller;

import com.smsk.HospitalManagement.entity.Patient;
import com.smsk.HospitalManagement.service.Patientser;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.Controller;

import java.util.List;

@RestController
@RequestMapping("/Patient")
@RequiredArgsConstructor
public class Patientcontroller {
    private final Patientser controller;

    @GetMapping("/getall")
    public List<Patient> getall(){
        return controller.getall();
    }
    @GetMapping("/getbyid/{id}")
    public Patient getbyid(@PathVariable Long id){
        return controller.getbyId(id);
    }
    @PostMapping("add")
    public Patient add(@RequestBody Patient data){
        return controller.add(data);
    }
    @PutMapping("/update/{id}")
    public Patient update(@RequestBody Patient new_data,@PathVariable Long id){
        return controller.update(id,new_data);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        controller.delete(id);
    }
}