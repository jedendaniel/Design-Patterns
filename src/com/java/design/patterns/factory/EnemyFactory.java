package com.java.design.patterns.factory;

import com.java.design.patterns.enemy.Enemy;
import com.java.design.patterns.enemy.Spiderman;
import com.java.design.patterns.enemy.Superman;

public class EnemyFactory {

    public static Enemy getEnemy(EnemyAbstractFactory factory){
        System.out.println("Creating enemy with " + factory.getClass().getName());
        return factory.createEnemy();
    }

    public static Enemy getEnemy(EnemyType enemyType){
        System.out.println("Creating " + enemyType.name() + " with factory method..");
        switch(enemyType){
            case SUPERMAN:
                return new Superman();
            case SPIDERMAN:
                return new Spiderman();
        }
        throw new IllegalArgumentException("Enemy type: " + enemyType + " is not recognized.");
    }
}
