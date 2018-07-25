package com.java.design.patterns.mediator;

public class Message {
    private String recipient;
    private String content;

    public Message(String recipient, String content) {
        this.recipient = recipient;
        this.content = content;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getContent() {
        return content;
    }
}
