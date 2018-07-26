package com.java.design.patterns.strategy;

public class DefeaterContext {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void defeatEnemy(){
        strategy.tryToDefeatEnemy();
    }
}
