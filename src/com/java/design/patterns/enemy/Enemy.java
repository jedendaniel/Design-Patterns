package com.java.design.patterns.enemy;

import com.java.design.patterns.composite.EnemyGroupComponent;

public abstract class Enemy extends EnemyGroupComponent {

    protected String name;
    protected int damage;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getInfo(int row) {
        return getTab(row) + "> " + name + "\n";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void move(){}
    public void attack(){}
}
