package com.isut.springboot1.dao;

import java.util.HashSet;
import java.util.Set;

public class StudentDto {
    protected StudentDto() {
    }

    public StudentDto(Student student) {
        Id = student.getId();
        firstName = student.getFirstName();
        lastName = student.getLastName();
        for (Address address : student.getAddress()) {
            this.addresses.add(new AddressDto(address));
        }
    }

    public StudentDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public StudentDto(String firstName, String lastName, String city, String street, String state, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        addresses.add(new AddressDto(city, street, state, zip));
    }

    private Long Id;
    private String firstName;
    private String lastName;
    private Set<AddressDto> addresses = new HashSet<>();

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public Set<AddressDto> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<AddressDto> addresses) {
        this.addresses = addresses;
    }
}


