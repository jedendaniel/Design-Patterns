package com.java.design.patterns.mediator;

import com.java.design.patterns.observer.Observer;
import com.java.design.patterns.observer.Server;
import com.java.design.patterns.state.ServerState;

public class User extends Observer {
    private String name;
    private Chat chat;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Chat getChat() {
        return chat;
    }

    public void joinChat(Chat chat){
        this.chat = chat;
    }

    public void sendMessage(String messageContent){
        System.out.println(name + " sent message..\nMe: " + messageContent);
        chat.send(new Message(this.name, messageContent));
    }

    public void receiveMessage(Message message){
        System.out.println("What " + name + " see:");
        System.out.println(message.getRecipient() + ": " + message.getContent());
    }

    @Override
    public void update() {
        System.out.println("Update for " + name + " -> Server: " +
                ((Server)subject).getName() + " is " + ((Server)subject).getState().name() + " now.");
    }

    public void joinServer(){
        switch (((Server)subject).getState()){
            case ONLINE:
                System.out.println("You joined server " + ((Server)subject).getName());
                break;
            case OFFLINE:
                System.out.println("Unable to join server " + ((Server)subject).getName());
        }
    }
}
