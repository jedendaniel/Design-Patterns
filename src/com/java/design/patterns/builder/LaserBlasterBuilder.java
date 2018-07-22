package com.java.design.patterns.builder;

public class LaserBlasterBuilder extends GunBuilder {
    @Override
    public void buildAmmunition() {
        gun.setAmmunition("Ammunition: laser beam, big damage, high speed, low ratio");
    }

    @Override
    public void buildScope() {
        gun.setScope("Scope: aim a little aaand Bzuuu!");
    }
}
