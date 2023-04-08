package com.mycompany.laboratory5;

import java.util.List;
import java.util.ArrayList;

public class Catalog {
    private String name;
    private List<Document> docs = new ArrayList<>();
    Catalog(String name) {
        this.name = name; 
    }
    public void add(Document doc) {
        docs.add(doc);
    }
    @Override
    public String toString() {
        for(Document doc : docs) {
            System.out.println(doc.getTitle());
        }
        return "Good";
    }
    
}
