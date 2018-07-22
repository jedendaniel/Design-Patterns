package com.java.design.patterns.sheep;

public class SuperSheep extends Sheep{

    public SuperSheep() {
        description = "We don't like super guys here but this is kinda cute";
    }

    @Override
    public void bleat() {
        System.out.println("Bee! :) Bee! ++");
    }
}
