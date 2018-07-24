package com.java.design.patterns.singleton;

import com.java.design.patterns.enemy.Enemy;

public class IronMan extends Enemy {
    private static final IronMan instance = new IronMan();

    public static IronMan getInstance(){
        return instance;
    }

    private IronMan() {
        name = "Iron Man";
    }

    public void SayName(){
        System.out.println("Now I'm " + name);
    }
}
