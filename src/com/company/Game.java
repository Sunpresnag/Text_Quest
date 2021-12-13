package com.company;

public class Game implements  UserChoiceListener{
    private Storage storage;
    private View view;
    private Location currenLocation;

    public Game(Storage storage) {
        this.storage = storage;
        this.view = new View(this);
    }
    public void start(){
        currenLocation = storage.getLocation(0);
        view.showLocation(currenLocation);
    }
    public void userChoise(int actionIndex){
        int idLoc = currenLocation.getActions()[actionIndex].getDestLocationId();
        if (idLoc != -1){
            currenLocation = storage.getLocation(idLoc);
            view.showLocation(currenLocation);
        }
    }
}
