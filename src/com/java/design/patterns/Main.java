package com.java.design.patterns;

import com.java.design.patterns.builder.GunMarket;
import com.java.design.patterns.enemy.Enemy;
import com.java.design.patterns.factory.EnemyFactory;
import com.java.design.patterns.factory.EnemyType;
import com.java.design.patterns.factory.SpidermanFactory;
import com.java.design.patterns.factory.SupermanFactory;
import com.java.design.patterns.builder.FrogLauncherBuilder;
import com.java.design.patterns.gun.Gun;
import com.java.design.patterns.builder.LaserBlasterBuilder;
import com.java.design.patterns.prototype.SheepCache;
import com.java.design.patterns.sheep.Sheep;

public class Main {
    public static void main(String[] args) {

        testAbstractFactory();
        testFactoryMethod();
        testBuilder();
        testPrototype();
    }

    private static void testAbstractFactory(){
        System.out.println("Abstract factory:");
        Enemy superman = EnemyFactory.getEnemy(new SupermanFactory());
        superman.move();
        superman.attack();
        Enemy spiderman = EnemyFactory.getEnemy(new SpidermanFactory());
        spiderman.move();
        spiderman.attack();
        System.out.println("-----------------------------\n");
    }

    private static void testFactoryMethod(){
        System.out.println("Factory method:");
        for(EnemyType enemyType : EnemyType.values()){
            Enemy e = EnemyFactory.getEnemy(enemyType);
            e.attack();
            e.move();
        }
        System.out.println("-----------------------------\n");
    }

    private static void testBuilder(){
        System.out.println("Builder:");
        GunMarket gunMarket = new GunMarket();
        FrogLauncherBuilder frogLauncherBuilder = new FrogLauncherBuilder();
        LaserBlasterBuilder laserBlasterBuilder = new LaserBlasterBuilder();
        gunMarket.setGunBuilder(frogLauncherBuilder);
        gunMarket.constructGun();
        Gun frogLauncher = gunMarket.getGun();
        System.out.println(frogLauncher.getAmmunition());
        System.out.println(frogLauncher.getScope());
        gunMarket.setGunBuilder(laserBlasterBuilder);
        gunMarket.constructGun();
        Gun laserBlaster = gunMarket.getGun();
        System.out.println(laserBlaster.getAmmunition());
        System.out.println(laserBlaster.getScope());
        System.out.println("-----------------------------\n");
    }

    private static void testPrototype(){
        System.out.println("Prototype:");
        SheepCache.loadCache();
        Sheep blackSheepClone = SheepCache.getSheep("1");
        System.out.println(blackSheepClone.getClass().getName() + " clone:\n"
                +  blackSheepClone.getDescription() + " and it says: ");
        blackSheepClone.bleat();
        Sheep superSheepClone = SheepCache.getSheep("2");
        System.out.println(superSheepClone.getClass().getName() + " clone:\n"
                +  superSheepClone.getDescription() + " and it says: ");
        superSheepClone.bleat();
        System.out.println("-----------------------------\n");
    }
}
