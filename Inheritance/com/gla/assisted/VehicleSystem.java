package com.gla.assisted;


class Vehicle {
    int maxSpeed;
    String fuelType;

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;
}

class Truck extends Vehicle {
    int loadCapacity;
}

class Motorcycle extends Vehicle {
    boolean hasGear;
}

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle[] v = {new Car(), new Truck(), new Motorcycle()};
        for (Vehicle ve : v) {
            ve.displayInfo();
        }
    }
}
