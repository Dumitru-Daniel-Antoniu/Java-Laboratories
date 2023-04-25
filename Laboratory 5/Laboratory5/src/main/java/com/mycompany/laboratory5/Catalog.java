package com.mycompany.laboratory5;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class Catalog implements Serializable {
    private String name;
    private List<Document> docs = new ArrayList<>();
    public Catalog() {}
    public Catalog(String name) {
        this.name = name; 
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void add(Document doc) {
        docs.add(doc);
    }
    public Document findById(String id) {
        return docs.stream().filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }
    @Override
    public String toString() {
        return "Catalog [ name: " + name + ", docs: " + docs + " ]";
    }
    
}
