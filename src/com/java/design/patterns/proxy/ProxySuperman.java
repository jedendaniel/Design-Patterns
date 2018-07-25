package com.java.design.patterns.proxy;

import com.java.design.patterns.enemy.Enemy;
import com.java.design.patterns.enemy.Superman;

public class ProxySuperman extends Enemy {
    Superman realSuperman;
    String actor;

    public ProxySuperman(String actor) {
        this.actor = actor;
        realSuperman = new Superman(actor);
    }

    @Override
    public void move() {
        realSuperman.move();
    }

    @Override
    public void attack() {
        realSuperman.attack();
    }
}
