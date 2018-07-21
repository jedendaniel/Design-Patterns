package com.java.design.patterns.factory;

import com.java.design.patterns.enemy.Enemy;
import com.java.design.patterns.factory.EnemyAbstractFactory;

public class EnemyFactory {
    public static Enemy getEnemy(EnemyAbstractFactory factory){
        return factory.createEnemy();
    }
}
