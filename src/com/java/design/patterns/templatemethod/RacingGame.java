package com.java.design.patterns.templatemethod;

public class RacingGame extends Game {

    public RacingGame() {
        System.out.println("Racing game.");
    }

    @Override
    void initialize() {
        System.out.println("Initialize player and enemies at the start line.");
    }

    @Override
    void startPlay() {
        System.out.println("3.. 2.. 1.. gogogogo!!");
    }

    @Override
    void endPlay() {
        System.out.println("Finish line crossed..");
    }
}
