package com.company.com.car;

public abstract class Car  {
    private String nameOfSegment;
    private String model;
    private String color;
    private double price;
    private int fuelCons;

    public Car(String model, String color, double price, int fuelcons, String nameOfSegment) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.fuelCons = fuelcons;
        this.nameOfSegment = nameOfSegment;
    }

    public String getNameOfSegment() {
        return nameOfSegment;
    }

    public void setNameOfSegment(String nameOfSegment) {
        this.nameOfSegment = nameOfSegment;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getFuelCons() {
        return fuelCons;
    }

    public void setFuelCons(int fuelCons) {
        this.fuelCons = fuelCons;
    }

    public String toString(){
        return "Car: " + this.nameOfSegment + "; model: " + this.model + "; color: "
                + this.color + "; price: " + this.price + "; fuel consumption: "
                + this.fuelCons + ".";
    }
}