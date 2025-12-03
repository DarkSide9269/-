package com.rental;

class SUV extends Car {
    public SUV(String model, double pricePerDay) {
        super(model, pricePerDay);
    }

    @Override
    public void showInfo() {
        System.out.println("SUV: " + model + ", " + pricePerDay + "$/day");
    }
}
