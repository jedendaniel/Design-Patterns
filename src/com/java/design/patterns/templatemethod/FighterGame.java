package com.java.design.patterns.templatemethod;

public class FighterGame extends Game{

    public FighterGame() {
        System.out.println("Fighter game.");
    }

    @Override
    void initialize() {
        System.out.println("Initialize player and enemy opposite themselves.");
    }

    @Override
    void startPlay() {
        System.out.println("Ready, steady, fight!");
    }

    @Override
    void endPlay() {
        System.out.println("K.O. and the winner is..");
    }
}
