package com.eufhapi.eufhapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeControler {

    @GetMapping("/Mitarbeiter")
    public String GetAllPatienten() {
        return "Hello web";
    }

}
