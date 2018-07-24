package com.java.design.patterns.adapter;

import com.java.design.patterns.enemy.Enemy;
import com.java.design.patterns.sheep.Sheep;

public class EnemyAdapter extends Enemy {
    Sheep sheep;

    public EnemyAdapter(Sheep sheep) {
        this.sheep = sheep;
    }

    @Override
    public void attack() {
        System.out.println("Sheep lost its mind and attacks by bleating:");
        sheep.bleat();
    }

    @Override
    public void move() {
        System.out.println("Sheep lost its mind and is moving to you like an enemy:");
        sheep.move();
    }
}
