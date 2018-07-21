package com.java.design.patterns.enemy;

public abstract class Enemy {

    protected String name;
    protected int damage;

    public String getName() {
        return name;
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
