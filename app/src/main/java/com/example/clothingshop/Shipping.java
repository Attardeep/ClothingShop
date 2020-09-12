package com.example.clothingshop;


public class Shipping {

    String shippingId, name, email, phone, address, country;

    public Shipping() {
    }

    public Shipping(String shippingId, String name, String email, String phone, String address, String country) {
        this.shippingId = shippingId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.country = country;
    }

    public String getShippingId() {
        return shippingId;
    }

    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
