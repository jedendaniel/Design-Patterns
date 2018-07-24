package com.java.design.patterns.sheep;

public abstract class Sheep implements Cloneable {

    private String id;
    protected String description;

    abstract public void bleat();
    abstract public void move();

    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }
}
