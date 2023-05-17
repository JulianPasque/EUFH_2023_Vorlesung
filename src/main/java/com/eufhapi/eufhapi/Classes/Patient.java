package com.eufhapi.eufhapi.Classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {

    // Eigenschaften
    private List<Treatment> treatments;

    // Methoden
    public Patient(int id, String firstName, String lastName, LocalDate birthdate, String geschlecht, String street,
            String houseNumber, String postCode, String city, String telefoneNumber, String email)
            throws Exception {
        super(id, firstName, lastName, birthdate, geschlecht, street, houseNumber, postCode, city, telefoneNumber,
                email);
    }

    public Patient(int id, String firstName, String lastName) {
        super(id, firstName, lastName);

    }

    public List<Treatment> getTreatments() {
        return treatments;
    }

    public void setTreatments(List<Treatment> treatments) {
        this.treatments = treatments;
    }

    public void addTreatment(Treatment treatment) {
        if (getTreatments() == null)
            setTreatments(new ArrayList<Treatment>());

        getTreatments().add(treatment);
    }
}
