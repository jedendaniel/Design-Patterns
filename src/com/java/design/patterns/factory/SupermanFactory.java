package com.java.design.patterns.factory;

import com.java.design.patterns.enemy.Enemy;
import com.java.design.patterns.enemy.Superman;

public class SupermanFactory implements EnemyAbstractFactory {
    @Override
    public Enemy createEnemy() {
        return new Superman();
    }
}
