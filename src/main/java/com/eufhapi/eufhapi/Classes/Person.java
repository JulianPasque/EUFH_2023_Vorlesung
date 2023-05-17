package com.eufhapi.eufhapi.Classes;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    // Eigenschaften
    private int id;

    private String firstName;

    private String lastName;

    private LocalDate birthdate;

    private String gender;

    private Adress adress;

    private String telefoneNumber;

    private String email;

    // Konstruktoren
    public Person(int id, String firstName, String lastName, LocalDate birthdate, String gender, String street,
            String houseNumber, String postCode, String city, String telefoneNumber, String email)
            throws Exception {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setBirthdate(birthdate);
        setGender(gender);
        setTelefoneNumber(telefoneNumber);
        setEmail(email);
        setAdress(new Adress(city, street, postCode, houseNumber));
    }

    public Person(int id, String firstName, String lastName) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Person(int id, String firstName) {
        setId(id);
        setFirstName(firstName);
    }

    public Person(int id, String firstName, String lastName, LocalDate birthdate, String gender, String telefoneNumber,
            String email)
            throws Exception {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setBirthdate(birthdate);
        setGender(gender);
        setTelefoneNumber(telefoneNumber);
        setEmail(email);
    }

    // Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getTelefoneNumber() {
        return telefoneNumber;
    }

    public void setTelefoneNumber(String telefoneNumber) {
        this.telefoneNumber = telefoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if (!email.contains("@"))
            throw new Exception("email - must contain an @");
        this.email = email;
    }

    // Methoden
    public int CalculateAge() {
        LocalDate currentDate = LocalDate.now();

        return Period.between(birthdate, currentDate).getYears();
    }
}