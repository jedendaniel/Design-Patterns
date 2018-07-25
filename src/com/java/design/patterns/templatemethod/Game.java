package com.java.design.patterns.templatemethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Game {
    private List<Character> players = new ArrayList<>();

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
