package com.java.design.patterns.strategy;

public class SupermanDefeater implements Strategy {
    @Override
    public void tryToDefeatEnemy() {
        System.out.println("I have kryptonite, now you are done!");
    }
}
