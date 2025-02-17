package org.lld.elevatordesign;

import org.lld.elevatordesign.enums.FLOOR;

import java.util.List;

public class Floor {
    private List<ExternalButton> externalButtonList;
    private FLOOR floor;

    public Floor(List<ExternalButton> externalButtonList,  FLOOR floor) {
        this.externalButtonList = externalButtonList;
        this.floor = floor;
    }

    public List<ExternalButton> getExternalButtonList() {
        return externalButtonList;
    }

    public void setExternalButtonList(List<ExternalButton> externalButtonList) {
        this.externalButtonList = externalButtonList;
    }

    public FLOOR getFloor() {
        return floor;
    }

    public void setFloor(FLOOR floor) {
        this.floor = floor;
    }
}
