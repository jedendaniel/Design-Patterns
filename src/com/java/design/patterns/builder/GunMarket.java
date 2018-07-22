package com.java.design.patterns.builder;

import com.java.design.patterns.gun.Gun;

public class GunMarket {
    private GunBuilder gunBuilder;

    public void setGunBuilder(GunBuilder gunBuilder) {
        System.out.println("Setting gun builder to " + gunBuilder.getClass().toString());
        this.gunBuilder = gunBuilder;
    }

    public Gun getGun(){return gunBuilder.getGun();}

    public void constructGun(){
        System.out.println("Constructing gun..");
        gunBuilder.createNewGun();
        gunBuilder.buildAmmunition();
        gunBuilder.buildScope();
    }
}
