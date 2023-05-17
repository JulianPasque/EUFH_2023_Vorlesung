package com.eufhapi.eufhapi.Classes;

import java.time.LocalDate;

public class SeniorDoctor extends Doctor {
    // Eigenschaften
    private int numberOfAssistants;
    private String station;

    // Konstruktoren
    public SeniorDoctor(int id, String firstName, String lastName, LocalDate birthdate, String gender, String street,
            String houseNumber, String postCode, String city, String telefoneNumber, String email, String doctorNumber,
            String specialization, int numberOfAssistants, String station) throws Exception {
        super(id, firstName, lastName, birthdate, gender, street, houseNumber, postCode, city, telefoneNumber, email,
                doctorNumber, specialization);
        setNumberOfAssistants(numberOfAssistants);
        setStation(station);
    }

    // Methoden
    @Override
    public void visiteDurchfuehren() {

    }

    public int getNumberOfAssistants() {
        return numberOfAssistants;
    }

    public void setNumberOfAssistants(int numberOfAssistants) {
        this.numberOfAssistants = numberOfAssistants;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }
}