package com.mycompany.homeworklaboratory5;

public class ToStringCommand implements CommandClass {
    @Override
    public void doCommand(Catalog catalog, Document document, String path) {
        System.out.println("Catalog [ name: " + catalog.getName() + ", docs: " + catalog.getDocs() + " ]");
    }
}
