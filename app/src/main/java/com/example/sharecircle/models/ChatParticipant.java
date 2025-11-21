package com.example.sharecircle.models;

public class ChatParticipant {

    private String chatId;
    private String userId;

    public ChatParticipant() {}

    public ChatParticipant(String chatId, String userId) {
        this.chatId = chatId;
        this.userId = userId;
    }

    public String getChatId() { return chatId; }
    public void setChatId(String chatId) { this.chatId = chatId; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
}
