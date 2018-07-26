package com.java.design.patterns.strategy;

public class SpidermanDefeater implements Strategy {
    @Override
    public void tryToDefeatEnemy() {
        System.out.println("Hahaha! I abducted Mary Jane, you have to take a risk so I will outsmart you!");
    }
}
