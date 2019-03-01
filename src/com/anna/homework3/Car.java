package com.anna.homework3;

import java.util.ArrayList;
import java.util.Date;

public class Car {

    private final Date manufacturedAt;
    private String typeOfMoto;
    private int maxSpeed;
    private double timeto100km;
    private int capacityPassenger;
    private int numberOfPassenger;
    private int currentSpeed;
    private ArrayList<CarWheel> carWheels;
    private ArrayList<CarDoor> carDoors;

    public Car(Date manufacturedAt) {
        this.manufacturedAt = manufacturedAt;
    }

    public Car(Date manufacturedAt, String typeOfMoto, int maxSpeed, double timeto100km, int capacityPassenger,
               int numberOfPassenger, int currentSpeed) {
        this.manufacturedAt = manufacturedAt;
        this.typeOfMoto = typeOfMoto;
        this.maxSpeed = maxSpeed;
        this.timeto100km = timeto100km;
        this.capacityPassenger = capacityPassenger;
        this.numberOfPassenger = numberOfPassenger;
        this.currentSpeed = currentSpeed;
    }

    public void changeCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void addOnePassenger() {
        if (numberOfPassenger != capacityPassenger) {
            this.numberOfPassenger++;
        } else {
            return;
        }
    }

    public void dropOutOnePassenger() {
        if (numberOfPassenger > 0) {
            numberOfPassenger--;
        } else {
            return;
        }
    }

    public void dropOutAllPassengers() {
        if (numberOfPassenger > 0) {
            this.numberOfPassenger = 0;
        } else {
            return;
        }
    }

    public void getDoor(int index) {
        carDoors.get(index);
    }

    public void getWheel(int index) {
        carWheels.get(index);
    }

    public void addWheel(int num) {
        for (int i = 0; i < num; i++) {
            carWheels.add(new CarWheel());
        }
    }

    public void removeAllWheel() {
        carWheels.clear();
    }

    public double wrongWheel() {
        double wrongWheel = 1;
        for (int i = 0; i < carWheels.size(); i++) {
            double currentWheel = carWheels.get(i).getTireIntegrity();
            if (currentWheel < wrongWheel) {
                wrongWheel = currentWheel;
            }
        }
        return wrongWheel;
    }

    public double currentMaxSpeed() {
        if (this.numberOfPassenger == 0) {
            return 0;
        } else {
            int currentMaxSpeed = (int) (this.maxSpeed * wrongWheel());
            return currentMaxSpeed;
        }
    }


    public void printCarInfo() {
        System.out.println("Car manufactered at: " + manufacturedAt);
        System.out.println("Type of moto: " + typeOfMoto);
        System.out.println("Max speed of new car: " + maxSpeed);
        System.out.println("Time to 100 km/h: " + timeto100km);
        System.out.println("Capacity: " + capacityPassenger + " person");
        System.out.println("Now im car: " + numberOfPassenger + " person");
        System.out.println("Current speed: " + currentSpeed + " km/h");
        System.out.println("Current MAX speed: " + currentMaxSpeed());
    }
}