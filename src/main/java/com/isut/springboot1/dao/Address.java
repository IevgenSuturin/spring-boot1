package com.isut.springboot1.dao;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Access(AccessType.FIELD)
public class Address {
    protected Address(){}

    private String city;
    private String state;
    private String street;
    @Column(name = "ZIP_CODE")
    private String zip;

    public Address(String city, String state, String street, String zip) {
        this.city = city;
        this.state = state;
        this.street = street;
        this.zip = zip;
    }

    public Address(AddressDto addressDto)
    {
        this.city = addressDto.getCity();
        this.state = addressDto.getState();
        this.street = addressDto.getStreet();
        this.zip = addressDto.getZip();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", street='" + street + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
