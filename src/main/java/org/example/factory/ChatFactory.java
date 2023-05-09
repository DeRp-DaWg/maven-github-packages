package org.example.factory;

import org.example.chat.Chat;

public class ChatFactory {
    public ChatFactory() {
    }
    
    public Chat createStandardChat() {
        return new Chat();
    }
}
