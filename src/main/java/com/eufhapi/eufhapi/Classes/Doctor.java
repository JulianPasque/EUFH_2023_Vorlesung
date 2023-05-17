package com.eufhapi.eufhapi.Classes;

import java.time.LocalDate;

public class Doctor extends Person {

    // Eigenschaften
    private String doctorNumber;

    private String specialization;

    // Konstruktor
    public Doctor(int id, String firstName, String lastName, LocalDate birthdate, String gender, String street,
            String houseNumber, String postCode, String city, String telefoneNumber, String email, String doctorNumber,
            String specialization) throws Exception {
        super(id, firstName, lastName, birthdate, gender, street, houseNumber, postCode, city, telefoneNumber, email);
        setDoctorNumber(doctorNumber);
        setSpecialization(specialization);
    }

    // Methoden
    public String getDoctorNumber() {
        return doctorNumber;
    }

    public void setDoctorNumber(String doctorNumber) {
        this.doctorNumber = doctorNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Not implemented - specification missing
    public void visiteDurchfuehren() {

    }
}
