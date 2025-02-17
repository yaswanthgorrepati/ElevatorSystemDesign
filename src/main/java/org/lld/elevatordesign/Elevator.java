package org.lld.elevatordesign;

import org.lld.elevatordesign.enums.DIRECTION;
import org.lld.elevatordesign.enums.FLOOR;
import org.lld.elevatordesign.enums.STATE;

public class Elevator {
    private int elevatorNumber;
    private STATE state;
    private DIRECTION direction;
    private InternalButton internalButton;
    private Display display;
    private FLOOR floor;

    public Elevator(int elevatorNumber, STATE state, DIRECTION direction, InternalButton internalButton, Display display, FLOOR floor) {
        this.elevatorNumber = elevatorNumber;
        this.state = state;
        this.direction = direction;
        this.internalButton = internalButton;
        this.display = display;
        this.floor = floor;
    }

    public int getElevatorNumber() {
        return elevatorNumber;
    }

    public void setElevatorNumber(int elevatorNumber) {
        this.elevatorNumber = elevatorNumber;
    }

    public STATE getState() {
        return state;
    }

    public void setState(STATE state) {
        this.state = state;
    }

    public DIRECTION getDirection() {
        return direction;
    }

    public void setDirection(DIRECTION direction) {
        this.direction = direction;
    }

    public InternalButton getInternalButton() {
        return internalButton;
    }

    public void setInternalButton(InternalButton internalButton) {
        this.internalButton = internalButton;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public FLOOR getFloor() {
        return floor;
    }

    public void setFloor(FLOOR floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "elevatorNumber=" + elevatorNumber +
                ", state=" + state +
                ", direction=" + direction +
                ", display=" + display +
                ", floor=" + floor +
                '}';
    }
}
