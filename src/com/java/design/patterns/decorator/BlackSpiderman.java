package com.java.design.patterns.decorator;

import com.java.design.patterns.enemy.Enemy;
import com.java.design.patterns.enemy.Spiderman;

public class BlackSpiderman extends Enemy {

    Spiderman spiderman;

    public BlackSpiderman(Spiderman spiderman) {
        this.spiderman = spiderman;
    }

    @Override
    public void move() {
        spiderman.move();
        System.out.println("but this time, in black");
    }

    @Override
    public void attack() {
        spiderman.attack();
        System.out.println("but this time, in black");
    }
}
