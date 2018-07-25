package com.java.design.patterns.mediator;

import java.util.HashMap;

public class ChatImpl implements Chat {
    private HashMap<String, User> users = new HashMap<>();

    public void register(User user){
        users.put(user.getName(),user);
        user.joinChat(this);
    }

    @Override
    public void send(Message message) {
        users.keySet().stream()
                .filter(e -> !e.equals(message.getRecipient()))
                .forEach(e -> users.get(e).receiveMessage(message));
    }
}
