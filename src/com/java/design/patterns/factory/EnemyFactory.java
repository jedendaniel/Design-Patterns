package com.java.design.patterns.factory;

import com.java.design.patterns.enemy.Enemy;

public class EnemyFactory {
    public static Enemy getEnemy(EnemyAbstractFactory factory){
        System.out.println("Creating enemy with " + factory.getClass().toString());
        return factory.createEnemy();
    }
}
