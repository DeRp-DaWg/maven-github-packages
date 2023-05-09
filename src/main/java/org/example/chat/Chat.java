package org.example.chat;

import java.util.ArrayList;

public class Chat {
    private ArrayList<Message> messages = new ArrayList<>();
    
    public Chat() {
    }
    
    public void addMessage(Message message) {
        this.messages.add(message);
    }
}
