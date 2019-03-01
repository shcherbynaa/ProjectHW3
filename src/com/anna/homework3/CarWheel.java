package com.anna.homework3;

public class CarWheel {

    private double tireIntegrity;

    public CarWheel() {
        this.tireIntegrity = 1;
    }

    public CarWheel(double tireIntegrity) {
        this.tireIntegrity = tireIntegrity;
    }

    public void changeTire() {
        tireIntegrity = 1;
    }

    public void wipeTire(double percentOfWipe) {
        tireIntegrity = tireIntegrity - 0.01 * percentOfWipe;
    }

    public double getTireIntegrity() {
        return tireIntegrity;
    }

    public void printInfoCarWheel() {
        System.out.println("Wheel condition - " + getTireIntegrity());
    }
}