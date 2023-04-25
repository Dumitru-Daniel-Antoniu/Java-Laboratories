package com.mycompany.laboratory5;

import java.io.IOException;

public class Laboratory5 {
    public static void main(String[] args) throws InvalidCatalogException, IOException {
        Laboratory5 app = new Laboratory5();
        app.testCreateSave();
        app.testLoadView();
    }
    private void testCreateSave() throws IOException {
        Catalog catalog = new Catalog("MyDocuments");
        var book = new Document("article1", "1");
        var article = new Document("book1", "2");
        var paint = new Document("paint1", "3");
        catalog.add(book);
        catalog.add(article);
        catalog.add(paint);
        System.out.println(catalog.toString());
        CatalogUtil.save(catalog, "C:/Verify/catalog.json");
    }
    private void testLoadView() throws InvalidCatalogException, IOException {
        Catalog catalog = CatalogUtil.load("C:/Verify/catalog.json");
    }
}
