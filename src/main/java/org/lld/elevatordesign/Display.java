package org.lld.elevatordesign;

import org.lld.elevatordesign.enums.DIRECTION;

public class Display {
    private int currentFloor;
    private DIRECTION direction;

    public Display(int currentFloor, DIRECTION direction) {
        this.currentFloor = currentFloor;
        this.direction = direction;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public DIRECTION getDirection() {
        return direction;
    }

    public void setDirection(DIRECTION direction) {
        this.direction = direction;
    }
}
