package com.spring.boot.rest.springrest.beans;

public class Address {

    private String location;
    private String city;
    private int pincode;

    public Address(String location, String city, int pincode) {
        this.location = location;
        this.city = city;
        this.pincode = pincode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
