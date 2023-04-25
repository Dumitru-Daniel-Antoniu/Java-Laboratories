package com.mycompany.homeworklaboratory5;

import java.util.List;

public class AddCommand implements CommandClass {
    @Override
    public void doCommand(Catalog catalog, Document document, String path) {
        List<Document> docs = catalog.getDocs();
        docs.add(document);
        catalog.setDocs(docs);
    }
}
