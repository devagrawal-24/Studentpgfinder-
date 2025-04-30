package com.studentpgfinder.models;

import java.util.List;

public class Hostel {
    private String name;
    private String location;
    private double price;
    private List<String> facilities;

    // Constructor
    public Hostel(String name, String location, double price, List<String> facilities) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.facilities = facilities;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<String> facilities) {
        this.facilities = facilities;
    }

    @Override
    public String toString() {
        return name + " - " + location + " - ₹" + price;
    }
}
