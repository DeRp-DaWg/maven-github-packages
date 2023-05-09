package org.example.chat;

import java.time.Instant;

public class Message {
    private String author;
    private Instant timestamp;
    private String message;
    
    public Message(String author, Instant timestamp, String message) {
        this.author = author;
        this.timestamp = timestamp;
        this.message = message;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public Instant getTimestamp() {
        return timestamp;
    }
    
    public String getMessage() {
        return message;
    }
}
