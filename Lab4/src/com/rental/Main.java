package com.rental;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Sedan("Toyota Camry", 45));
        cars.add(new SUV("BMW X5", 80));
        cars.add(new Truck("Ford F-150", 60));

        System.out.println("=== Available cars ===");
        for (Car car : cars) {
            car.showInfo();
        }

        Order order1 = new Order(cars.get(1), "Іван Петренко", "АН123456", 5);
        order1.setDamaged(true);

        System.out.println("\n=== Order info ===");
        order1.showOrder();
    }
}
