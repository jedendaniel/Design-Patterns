package com.java.design.patterns.factory;

import com.java.design.patterns.enemy.Enemy;
import com.java.design.patterns.enemy.Spiderman;
import com.java.design.patterns.factory.EnemyAbstractFactory;

public class SpidermanFactory implements EnemyAbstractFactory {
    @Override
    public Enemy createEnemy() {
        return new Spiderman();
    }
}
