package com.eufhapi.eufhapi.Classes;

public class Adress {

    // Constructors
    public Adress(String _city, String _street, String _postCode, String _houseNumber) {
        setCity(_city);
        setPostCode(_postCode);
        setHouseNumber(_houseNumber);
        setStreet(_street);
    }

    // Properties
    public String city;
    public String street;
    public String postCode;
    public String houseNumber;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
}
