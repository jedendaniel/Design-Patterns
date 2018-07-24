package com.java.design.patterns.bridge;

public class GreenGoblin implements Nemesis {
    @Override
    public void getDefeated() {
        System.out.println("Green Goblin tried to backstab but instead get frontstabed.");
    }
}
