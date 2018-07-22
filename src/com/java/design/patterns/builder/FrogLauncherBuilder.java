package com.java.design.patterns.builder;

public class FrogLauncherBuilder extends GunBuilder {

    @Override
    public void buildAmmunition() {
        gun.setAmmunition("Ammunition: frog grenades, big explosion, low speed");
    }

    @Override
    public void buildScope() {
        gun.setScope("Scope: no scope, just launch a frog");
    }
}
