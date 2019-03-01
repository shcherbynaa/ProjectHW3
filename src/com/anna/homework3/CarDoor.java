package com.anna.homework3;

public class CarDoor {

    private boolean isDoorOpen;
    private boolean isWindowOpen;

    public CarDoor() {
        this.isDoorOpen = false;
        this.isWindowOpen = false;
    }

    public CarDoor(boolean isDoorOpen, boolean isWindowOpen) {
        this.isDoorOpen = isDoorOpen;
        this.isWindowOpen = isWindowOpen;
    }

    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    public boolean isWindowOpen() {
        return isWindowOpen;
    }

    public void openDoor(boolean isDoorOpen) {
        this.isDoorOpen = true;
    }

    public void closeDoor(boolean isDoorOpen) {
        this.isDoorOpen = false;
    }

    public void openOrCloseDoor(boolean isDoorOpen) {
        if (isDoorOpen) {
            this.isDoorOpen = false;
        } else {
            this.isDoorOpen = true;
        }
    }

    public void openWindow(boolean isWindowOpen) {
        this.isWindowOpen = true;
    }


    public void closeWindow(boolean isWindowOpen) {
        this.isWindowOpen = false;
    }

    public void openOrCloseWindow(boolean isWindowOpen) {
        if (isWindowOpen) {
            this.isWindowOpen = false;
        } else {
            this.isWindowOpen = true;
        }
    }

    public void printInfoDoor() {
        System.out.println("Door is " + ((isDoorOpen) ? ("open") : ("closed")));
        System.out.println("Window is " + ((isWindowOpen) ? ("open") : ("closed")));
    }
}