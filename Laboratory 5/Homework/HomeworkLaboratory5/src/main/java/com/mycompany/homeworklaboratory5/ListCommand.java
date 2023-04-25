package com.mycompany.homeworklaboratory5;

public class ListCommand implements CommandClass {
    @Override
    public void doCommand(Catalog catalog, Document document, String path) {
        for (Document doc : catalog.getDocs()) {
            System.out.println("Name: " + doc.getName() + " " + "Id: " + doc.getId() + "Location: " + doc.getLocation());
        }
    }
}
