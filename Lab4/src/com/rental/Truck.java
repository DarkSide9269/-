package com.rental;

class Truck extends Car {
    public Truck(String model, double pricePerDay) {
        super(model, pricePerDay);
    }

    @Override
    public void showInfo() {
        System.out.println("Truck: " + model + ", " + pricePerDay + "$/day");
    }
}
