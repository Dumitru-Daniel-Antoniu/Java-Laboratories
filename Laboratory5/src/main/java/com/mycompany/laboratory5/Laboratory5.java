package com.mycompany.laboratory5;

public class Laboratory5 {
    public static void main(String[] args) {
        Catalog catalog = new Catalog("Food");
        Document doc1 = new Document("Fast-food");
        Document doc2 = new Document("Sea-food");
        Document doc3 = new Document("Fruits");
        Document doc4 = new Document("Vegetables");
        catalog.add(doc1);
        catalog.add(doc2);
        catalog.add(doc3);
        catalog.add(doc4);
        catalog.toString();
    }
}
