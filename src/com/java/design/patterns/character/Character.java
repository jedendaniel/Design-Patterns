package com.java.design.patterns.character;

import com.java.design.patterns.gun.Gun;
import com.sun.javafx.geom.Vec2f;

public class Character {

    private String name;
    private Vec2f actualPosition = new Vec2f(0,0);
    private int level = 1;

    public Character(String name) {
        this.name = name;
    }

    public Character(String name, Vec2f actualPosition, int level) {
        this.name = name;
        this.actualPosition = actualPosition;
        this.level = level;
    }

    public Character(Character character) {
        this.name = character.name;
        this.actualPosition = character.actualPosition;
        this.level = character.level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void move(Vec2f destination){
        actualPosition = destination;
        System.out.println(name + " moved to point: " + actualPosition.x + "," + actualPosition.y);
    }

    public void upgradeLevel(){
        level++;
        System.out.println(name + " reached leve: " + level);
    }
}
