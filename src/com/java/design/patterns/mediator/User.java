package com.java.design.patterns.mediator;

public class User {
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
}
