package com.isut.springboot1.dao;

public class AddressDto {
    private String city;
    private String street;
    private String state;
    private String zip;

    protected AddressDto(){}

    public AddressDto(Address address){
        this.city=address.getCity();
        this.state=address.getState();
        this.zip=address.getZip();
        this.street=address.getStreet();
    }

    public AddressDto(String city, String street, String state, String zip) {
        this.city = city;
        this.street = street;
        this.state = state;
        this.zip = zip;
    }

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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressDto)) return false;

        AddressDto that = (AddressDto) o;

        if (!getCity().equals(that.getCity())) return false;
        if (!getStreet().equals(that.getStreet())) return false;
        if (!getState().equals(that.getState())) return false;
        return getZip().equals(that.getZip());
    }

    @Override
    public int hashCode() {
        int result = getCity().hashCode();
        result = 31 * result + getStreet().hashCode();
        result = 31 * result + getState().hashCode();
        result = 31 * result + getZip().hashCode();
        return result;
    }
}
