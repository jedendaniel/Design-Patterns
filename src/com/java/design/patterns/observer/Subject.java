package com.java.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers = new ArrayList<>();

    public void register(Observer observer){
        observers.add(observer);
        observer.setSubject(this);
    }

    public void unregister(Observer observer){
        observers.remove(observer);
        observer.setSubject(null);
    }

    public void notifyObservers(){
        observers.forEach(e -> e.update());
    }
}
