package org.lld.elevatordesign;

import org.lld.elevatordesign.enums.DIRECTION;
import org.lld.elevatordesign.enums.FLOOR;

import java.util.LinkedList;
import java.util.Queue;

public class ElevatorController {
    private Elevator elevator;
    private Queue<Request> requestQueue;
    private boolean isRunning = false;

    public ElevatorController(Elevator elevator) {
        this.elevator = elevator;
        requestQueue = new LinkedList<>();
    }

    public Elevator getElevator() {
        return elevator;
    }

    public void setElevator(Elevator elevator) {
        this.elevator = elevator;
    }

    public Queue<Request> getRequestQueue() {
        return requestQueue;
    }

    public void setRequestQueue(Queue<Request> requestQueue) {
        this.requestQueue = requestQueue;
    }

    public void dispatchElevator(Request newRequest){
        if(newRequest.getDestinationFloor() == elevator.getFloor().getFloorNumber()){
            System.out.println("Elevator is at the same floor and door is opened! Floor " + newRequest.getDestinationFloor());
        }else{
            System.out.println("adding request to the queue. Floor" + newRequest.getDestinationFloor());
            requestQueue.add(newRequest);
                while(requestQueue.size() >0) {
                    Request request = requestQueue.peek();
                    if (elevator.getFloor().getFloorNumber() != request.getDestinationFloor()) {
                        System.out.println("Moving the elevator to " + request.getDestinationFloor() + " from  " + elevator.getFloor().getFloorNumber());
                        DIRECTION direction = elevator.getFloor().getFloorNumber() > request.getDestinationFloor() ? DIRECTION.DOWN : DIRECTION.UP;
                        elevator.setDirection(direction);
                        elevator.setDisplay(new Display(request.getDestinationFloor(), direction));
                        elevator.setFloor(FLOOR.getFloor(request.getDestinationFloor()));
                        requestQueue.poll();
                        System.out.println("Elevator" + elevator);
                    }
                }
            }
        }


}
