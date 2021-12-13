package com.company;

public class Action {
    private String description;
    private int idNextLocation;
    String getText(){
        return description;
    }
    int getDestLocationId(){
        return idNextLocation;
    }

    public Action(String text, int idNextLocation) {
        this.description = text;
        this.idNextLocation = idNextLocation;
    }
}