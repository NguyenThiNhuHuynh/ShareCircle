package com.example.sharecircle.models;

public class Badge {

    private String id;
    private String name;
    private String description;
    private int pointRequirement;
    private String iconUrl;

    public Badge() {}

    public Badge(String id, String name, String description,
                 int pointRequirement, String iconUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.pointRequirement = pointRequirement;
        this.iconUrl = iconUrl;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getPointRequirement() { return pointRequirement; }
    public void setPointRequirement(int pointRequirement) { this.pointRequirement = pointRequirement; }

    public String getIconUrl() { return iconUrl; }
    public void setIconUrl(String iconUrl) { this.iconUrl = iconUrl; }
}
