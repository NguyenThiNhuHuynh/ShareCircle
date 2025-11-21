package com.example.sharecircle.models;

public class Chat {

    private String id;
    private String itemId;
    private String createdAt;

    public Chat() {}

    public Chat(String id, String itemId, String createdAt) {
        this.id = id;
        this.itemId = itemId;
        this.createdAt = createdAt;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getItemId() { return itemId; }
    public void setItemId(String itemId) { this.itemId = itemId; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }
}
