package com.java.design.patterns.singleton;

public class IronMan {
    private static final IronMan instance = new IronMan();

    private String name = "Iron Man";

    public static IronMan getInstance(){
        return instance;
    }

    private IronMan() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void SayName(){
        System.out.println("Now I'm " + name);
    }
}
