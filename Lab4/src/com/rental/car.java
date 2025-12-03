package com.rental;

abstract class Car {
    protected String model;
    protected double pricePerDay;

    public Car(String model, double pricePerDay) {
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    public abstract void showInfo();

    public double getPricePerDay() {
        return pricePerDay;
    }

    public String getModel() {
        return model;
    }
}
