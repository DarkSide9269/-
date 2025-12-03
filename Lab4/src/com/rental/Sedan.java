package com.rental;

class Sedan extends Car {
    public Sedan(String model, double pricePerDay) {
        super(model, pricePerDay);
    }

    @Override
    public void showInfo() {
        System.out.println("Sedan: " + model + ", " + pricePerDay + "$/day");
    }
}
