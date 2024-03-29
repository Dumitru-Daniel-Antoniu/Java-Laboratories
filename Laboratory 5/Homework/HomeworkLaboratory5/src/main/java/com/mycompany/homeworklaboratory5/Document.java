package com.mycompany.homeworklaboratory5;

import java.util.Map;
import java.util.HashMap;
import java.io.Serializable;

public class Document implements Serializable {
    private String id;
    private String name;
    private String location;
    private Map<String, Object> tags = new HashMap<>();
    public Document() {}
    public Document(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Map<String, Object> getTags() {
        return tags;
    }
    public void setTags(Map<String, Object> tags) {
        this.tags = tags;
    }
    public void addTag(String key, Object obj) {
        tags.put(key, obj);
    }
}
