package com.java.design.patterns.observer;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
