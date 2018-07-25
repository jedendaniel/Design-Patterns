package com.java.design.patterns.sheep;

public class SuperSheep extends Sheep{

    String color;

    public SuperSheep() {
        description = "We don't like super guys here but this is kinda cute";
    }

    @Override
    public void bleat() {
        System.out.println("Bee! :) Bee! ++");
    }

    @Override
    public void move() {
        System.out.println("Super sheep is flying");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw(){
        System.out.println("Drawing super sheep of color " + color);
    }
}
