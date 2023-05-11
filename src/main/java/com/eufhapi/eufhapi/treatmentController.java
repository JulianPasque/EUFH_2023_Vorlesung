package com.eufhapi.eufhapi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eufhapi.eufhapi.Classes.Treatment;

@RestController
public class treatmentController {

    @GetMapping("/Treatments")
    public List<Treatment> GetAllTreatments() {

        List<Treatment> allTreatments = new ArrayList<>();

        allTreatments.add(new Treatment(1, LocalDate.of(2013, 1, 1)));

        return allTreatments;
    }

}