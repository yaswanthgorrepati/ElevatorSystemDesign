package org.lld.elevatordesign;

public class Request {

    private int destinationFloor;
    private int elevatorId;

    public Request(int destinationFloor, int elevatorId) {
        this.destinationFloor = destinationFloor;
        this.elevatorId = elevatorId;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }

    public int getElevatorId() {
        return elevatorId;
    }

    public void setElevatorId(int elevatorId) {
        this.elevatorId = elevatorId;
    }
}
