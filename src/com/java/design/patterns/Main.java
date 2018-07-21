package com.java.design.patterns;

import com.java.design.patterns.enemy.Enemy;
import com.java.design.patterns.factory.EnemyFactory;
import com.java.design.patterns.factory.SpidermanFactory;
import com.java.design.patterns.factory.SupermanFactory;

public class Main {
    public static void main(String[] args) {

        // Abstract factory
        Enemy superman = EnemyFactory.getEnemy(new SupermanFactory());
        superman.move();
        superman.attack();
        Enemy spiderman = EnemyFactory.getEnemy(new SpidermanFactory());
        spiderman.move();
        spiderman.attack();

    }
}
