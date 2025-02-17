package org.lld;

import org.lld.elevatordesign.*;
import org.lld.elevatordesign.enums.DIRECTION;
import org.lld.elevatordesign.enums.FLOOR;
import org.lld.elevatordesign.enums.STATE;

import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Elevator elevator = new Elevator(0, STATE.IDLE, DIRECTION.IDLE, null, new Display(0, DIRECTION.IDLE), FLOOR.FLOOR_0);
        ElevatorController elevatorController = new ElevatorController(elevator);
        ButtonDispatcher buttonDispatcher = new ButtonDispatcher(Arrays.asList(elevatorController));
        InternalButton internalButton = new InternalButton(buttonDispatcher, elevator.getElevatorNumber());
        elevator.setInternalButton(internalButton);

        ExternalButton externalButton = new ExternalButton(buttonDispatcher, FLOOR.FLOOR_0, elevator.getElevatorNumber());
        ExternalButton externalButton1 = new ExternalButton(buttonDispatcher, FLOOR.FLOOR_1, elevator.getElevatorNumber());
        ExternalButton externalButton2 = new ExternalButton(buttonDispatcher, FLOOR.FLOOR_2, elevator.getElevatorNumber());

        Floor floor = new Floor(Arrays.asList(externalButton), FLOOR.FLOOR_0);
        Floor floor1 = new Floor(Arrays.asList(externalButton1), FLOOR.FLOOR_1);
        Floor floor2 = new Floor(Arrays.asList(externalButton2), FLOOR.FLOOR_2);

        Building building = new Building(Arrays.asList(floor, floor1, floor2));

        externalButton.pressButton();
        internalButton.pressButton(2);

        System.out.println("queue size is " + elevatorController.getRequestQueue().size());

        externalButton2.pressButton();
//        System.out.println("queue size is " + elevatorController.getRequestQueue().size());
//
        externalButton.pressButton();
//        System.out.println("queue size is " + elevatorController.getRequestQueue().size());

        externalButton1.pressButton();

        internalButton.pressButton(2);
//        System.out.println("queue size is " + elevatorController.getRequestQueue().size());

        }
    }
