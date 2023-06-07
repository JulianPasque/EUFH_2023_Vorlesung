package com.eufhapi.eufhapi.Classes;

import java.time.LocalDate;

public class Patient extends Person {

    // Eigenschaften
    private PrefrentialContactApproach preferedContact;

    private LocalDate lastTreatment;

    // Konstruktoren
    public Patient(int id, String firstName, String lastName, LocalDate birthdate, String geschlecht, String street,
            String houseNumber, String postCode, String city, String telefoneNumber, String email,
            PrefrentialContactApproach contact, LocalDate lastTreatment)
            throws Exception {
        super(id, firstName, lastName, birthdate, geschlecht, street, houseNumber, postCode, city, telefoneNumber,
                email);

        setPreferedContact(contact);
        setLastTreatment(lastTreatment);
    }

    // Getter & Setter

    public PrefrentialContactApproach getPreferedContact() {
        return preferedContact;
    }

    public void setPreferedContact(PrefrentialContactApproach preferedContact) {
        this.preferedContact = preferedContact;
    }

    public LocalDate getLastTreatment() {
        return lastTreatment;
    }

    public void setLastTreatment(LocalDate lastTreatment) {
        this.lastTreatment = lastTreatment;
    }

    // Methoden
    public boolean CheckIfReminderIsRequired() {
        return getLastTreatment().isBefore(LocalDate.now().minusYears(1));
    }
}
