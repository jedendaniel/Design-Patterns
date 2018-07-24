package com.java.design.patterns.enemy;

public class Spiderman extends Enemy {

    public Spiderman() {
        this.name = "Spiderman";
        this.damage = 10;
    }

    @Override
    public void move() {
        System.out.println("Spiderman moves using his spider threads.");
    }

    @Override
    public void attack() {
        System.out.println("Spiderman attacks shooting spiders things.");
    }

    @Override
    public void defeatNemesis() {
        System.out.println("Spiderman is fighting his nemesis.");
        nemesis.getDefeated();
    }
}
