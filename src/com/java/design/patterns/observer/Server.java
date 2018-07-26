package com.java.design.patterns.observer;

import com.java.design.patterns.state.ServerState;

public class Server extends Subject {
    ServerState state;
    String name;

    public Server(String name) {
        this.name = name;
        state = ServerState.OFFLINE;
    }

    public ServerState getState() {
        return state;
    }

    public void setState(ServerState state) {
        this.state = state;
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
