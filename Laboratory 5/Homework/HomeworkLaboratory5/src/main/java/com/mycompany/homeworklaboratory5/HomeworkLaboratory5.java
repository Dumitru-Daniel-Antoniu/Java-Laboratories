package com.mycompany.homeworklaboratory5;

import java.io.IOException;

public class HomeworkLaboratory5 {
    public static void main(String[] args) throws InvalidCatalogException, IOException {
        /*Class c = java.lang.Character.Subset.class;
      String innerClassName = c.getName();
      System.out.println("The fully qualified name of the inner class is: " + innerClassName);*/
        HomeworkLaboratory5 app = new HomeworkLaboratory5();
        app.TestCreateSave();
        app.TestLoadView();
    }
    private void TestCreateSave() throws IOException {
        Catalog catalog = new Catalog("MyDocuments");
        Document book = new Document("article1", "1");
        Document article = new Document("book1", "2");
        Document paint = new Document("paint1", "3");
        AddCommand addCommand = new AddCommand();
        addCommand.doCommand(catalog, book, "C:/Verify/catalog.json");
        addCommand.doCommand(catalog, article, "C:/Verify/catalog.json");
        addCommand.doCommand(catalog, paint, "C:/Verify/catalog.json");
        ToStringCommand toStringCommand = new ToStringCommand();
        toStringCommand.doCommand(catalog, book, "C:/Verify/catalog.json");
        SaveCommand saveCommand = new SaveCommand();
        saveCommand.doCommand(catalog, book, "C:/Verify/catalog.json");
    }
    private void TestLoadView() throws InvalidCatalogException, IOException {
        Catalog catalog = new Catalog();
        Document book = new Document();
        LoadCommand loadCommand = new LoadCommand();
        loadCommand.doCommand(catalog, book, "C:/Verify/catalog.json");
        ListCommand listCommand = new ListCommand();
        listCommand.doCommand(catalog, book, "C:/Verify/catalog.json");
        ViewCommand viewCommand = new ViewCommand();
        viewCommand.doCommand(catalog, book, "C:/Verify/catalog.json");
        ReportCommand reportCommand = new ReportCommand();
        reportCommand.doCommand(catalog, book, "C:/Users/wwwdd/OneDrive/Desktop/Faculty/Year 2/Second semester/Advanced Programming/Laboratory 5/Homework/HomeworkLaboratory5/src/HTMLdocument.vm");
    }
}
