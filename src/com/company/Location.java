package com.company;

public class Location {
    private int id;
    private String description;
    private Action[] actions;

    public Location(int id, String text, Action[] actions) {
        this.id = id;
        this.description = text;
        this.actions = actions;
    }

    String getText(){
        return description;
    }
    Action[] getActions(){
        return actions;
    }
}