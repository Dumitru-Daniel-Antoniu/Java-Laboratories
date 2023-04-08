package com.mycompany.laboratory5;

import java.util.Map;
import java.util.HashMap;

public class Document {
    private String id;
    private String title;
    private String location;
    Document(String title) {
        this.title = title;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    private Map<String, Object> tags = new HashMap<>();
    public void addTag(String key, Object obj) {
        tags.put(key, obj);
    }
}
