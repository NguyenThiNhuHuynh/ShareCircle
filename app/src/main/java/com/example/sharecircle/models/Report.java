package com.example.sharecircle.models;

public class Report {

    private String id;
    private String reporterId;
    private String itemId;
    private String reason;
    private String createdAt;

    public Report() {}

    public Report(String id, String reporterId, String itemId,
                  String reason, String createdAt) {
        this.id = id;
        this.reporterId = reporterId;
        this.itemId = itemId;
        this.reason = reason;
        this.createdAt = createdAt;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getReporterId() { return reporterId; }
    public void setReporterId(String reporterId) { this.reporterId = reporterId; }

    public String getItemId() { return itemId; }
    public void setItemId(String itemId) { this.itemId = itemId; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }
}
