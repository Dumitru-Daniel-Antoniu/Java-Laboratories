package com.mycompany.laboratory5;

import java.util.Map;
import java.util.HashMap;
import java.io.Serializable;

public class Document implements Serializable {
    private String id;
    private String name;
    private String location;
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
    private Map<String, Object> tags = new HashMap<>();
    public void addTag(String key, Object obj) {
        tags.put(key, obj);
    }
}
