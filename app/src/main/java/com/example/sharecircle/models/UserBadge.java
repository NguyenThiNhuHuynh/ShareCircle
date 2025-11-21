package com.example.sharecircle.models;

public class UserBadge {

    private String userId;
    private String badgeId;
    private String earnedAt;

    public UserBadge() {}

    public UserBadge(String userId, String badgeId, String earnedAt) {
        this.userId = userId;
        this.badgeId = badgeId;
        this.earnedAt = earnedAt;
    }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getBadgeId() { return badgeId; }
    public void setBadgeId(String badgeId) { this.badgeId = badgeId; }

    public String getEarnedAt() { return earnedAt; }
    public void setEarnedAt(String earnedAt) { this.earnedAt = earnedAt; }
}
