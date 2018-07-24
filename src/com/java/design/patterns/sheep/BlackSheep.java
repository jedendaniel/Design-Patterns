package com.java.design.patterns.sheep;

public class BlackSheep extends Sheep {

    public BlackSheep() {
        description = "Little, poor black sheep who nobody loves";
    }

    @Override
    public void bleat() {
        System.out.println("Beee :( Beee :(");
    }

    @Override
    public void move() {
        System.out.println("Black sheep is jumping");
    }
}
