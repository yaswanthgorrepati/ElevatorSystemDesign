package org.lld.elevatordesign;

import org.lld.elevatordesign.enums.FLOOR;

public class ExternalButton {
    private ButtonDispatcher buttonDispatcher;
    private FLOOR floor;
    private int elevatorId;

    public ExternalButton(ButtonDispatcher buttonDispatcher, FLOOR floor, int elevatorId) {
        this.buttonDispatcher = buttonDispatcher;
        this.floor = floor;
        this.elevatorId = elevatorId;
    }

    public void pressButton() {
        buttonDispatcher.dispatch(new Request(floor.getFloorNumber(), elevatorId));
    }
}
