package com.company;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        //View view  = new View();
        Game game = new Game(storage);
        game.start();
    }
}