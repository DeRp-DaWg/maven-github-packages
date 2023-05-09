package org.example.factory;

import org.example.chat.Message;

import java.time.Instant;

public class MessageFactory {
    public MessageFactory() {
    }
    
    public Message createStandardMessage(String author, String message) {
        Instant timestamp = Instant.now();
        return new Message(author, timestamp, message);
    }
}
