package com.java.design.patterns.enemy;

public class Superman extends Enemy{

    private String actor;

    public Superman() {
        this.name = "Superman";
        this.damage = 20;
    }

    public Superman(String actor){
        this.name = "Superman";
        this.damage = 20;
        this.actor = actor;
    }

    @Override
    public void move() {
        System.out.println("Superman is flying with that hand pulled forward.");
    }

    @Override
    public void attack() {
        System.out.println("Superman attacks with laser from eyes, big punches etc.");
    }

    public void hireActor(String actor){
        this.actor = actor;
    }
}
