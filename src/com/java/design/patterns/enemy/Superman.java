package com.java.design.patterns.enemy;

public class Superman extends Enemy{

    public Superman() {
        this.name = "Superman";
        this.damage = 20;
    }

    @Override
    public void move() {
        System.out.println("Superman is flying with that hand pulled forward.");
    }

    @Override
    public void attack() {
        System.out.println("Superman attacks with laser from eyes, big punches etc.");
    }
}
