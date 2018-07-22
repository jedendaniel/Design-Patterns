package com.java.design.patterns.builder;

import com.java.design.patterns.gun.Gun;

public abstract class GunBuilder {
    protected Gun gun;

    public Gun getGun() {
        return gun;
    }

    public void createNewGun(){
        gun = new Gun();
    }

    public abstract void buildAmmunition();
    public abstract void buildScope();
}
