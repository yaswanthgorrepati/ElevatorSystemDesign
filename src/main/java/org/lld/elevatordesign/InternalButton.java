package org.lld.elevatordesign;

public class InternalButton {
    private ButtonDispatcher buttonDispatcher;
    private int elevatorId;

    public InternalButton(ButtonDispatcher buttonDispatcher, int elevatorId) {
        this.buttonDispatcher = buttonDispatcher;
        this.elevatorId = elevatorId;
    }

    public void pressButton(int destinatonFloor) {
        buttonDispatcher.dispatch(new Request(destinatonFloor, elevatorId));
    }
}
