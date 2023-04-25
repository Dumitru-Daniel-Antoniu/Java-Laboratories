package com.mycompany.homeworklaboratory5;

import java.io.IOException;

public interface CommandClass {
    public void doCommand(Catalog catalog, Document document, String path) throws InvalidCatalogException, IOException;
}
