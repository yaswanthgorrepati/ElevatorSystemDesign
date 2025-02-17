package org.lld.elevatordesign;

import java.util.List;


public class ButtonDispatcher {
    List<ElevatorController> elevatorControllerList;

    public ButtonDispatcher(List<ElevatorController> elevatorControllerList) {
        this.elevatorControllerList = elevatorControllerList;
    }

    public void dispatch(Request request){
        ElevatorController elevatorController = elevatorControllerList.get(request.getElevatorId());
        elevatorController.dispatchElevator(request);
    }
}
