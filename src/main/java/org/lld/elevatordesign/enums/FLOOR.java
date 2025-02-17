package org.lld.elevatordesign.enums;


public enum FLOOR {

    FLOOR_0(0),FLOOR_1(1), FLOOR_2(2), FLOOR_3(3), FLOOR_4(4), FLOOR_5(5);

    private int floorNumber;

    FLOOR(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public static FLOOR getFloor(int floorNum) {
        for (FLOOR floor : FLOOR.values()) {
            if (floor.getFloorNumber() == floorNum) {
                return floor;
            }
        }
        throw new IllegalArgumentException("Invalid floor number: " + floorNum);
    }

}
