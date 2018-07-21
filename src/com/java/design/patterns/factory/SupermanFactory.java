package com.java.design.patterns.factory;

import com.java.design.patterns.enemy.Enemy;
import com.java.design.patterns.enemy.Superman;
import com.java.design.patterns.factory.EnemyAbstractFactory;

public class SupermanFactory implements EnemyAbstractFactory {
    @Override
    public Enemy createEnemy() {
        return new Superman();
    }
}
