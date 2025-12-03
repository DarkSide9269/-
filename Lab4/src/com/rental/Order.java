package com.rental;

class Order implements Rentable {
    private Car car;
    private String clientName;
    private String passport;
    private int days;
    private boolean damaged = false;

    public Order(Car car, String clientName, String passport, int days) {
        this.car = car;
        this.clientName = clientName;
        this.passport = passport;
        this.days = days;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    @Override
    public double calculatePrice() {
        double base = car.getPricePerDay() * days;
        return damaged ? base + 500 : base;
    }

    @Override
    public void showOrder() {
        System.out.println("Client: " + clientName +
                ", Passport: " + passport +
                ", Car: " + car.getModel() +
                ", Days: " + days +
                ", Price: " + calculatePrice() + "$");
    }
}
