package com.java.design.patterns.enemy;

import com.java.design.patterns.bridge.Nemesis;
import com.java.design.patterns.composite.EnemyGroupComponent;

public abstract class Enemy extends EnemyGroupComponent {

    protected String name;
    protected int damage;
    protected Nemesis nemesis;

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

    public Nemesis getNemesis() {
        return nemesis;
    }

    public void setNemesis(Nemesis nemesis) {
        this.nemesis = nemesis;
    }

    public void move(){}
    public void attack(){}
    public void defeatNemesis(){}
}
