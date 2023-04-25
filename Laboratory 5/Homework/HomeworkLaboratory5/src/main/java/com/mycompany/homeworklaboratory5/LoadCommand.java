package com.mycompany.homeworklaboratory5;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class LoadCommand implements CommandClass {
    @Override
    public void doCommand(Catalog catalog, Document document, String path) throws InvalidCatalogException {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            catalog = objectMapper.readValue(new File(path), Catalog.class);
            if(catalog.getName().length() == 0 ) throw new InvalidCatalogException();
        }
        catch(IOException ex) {
            System.out.println("Unwanted behaviour at Input/Output.");
        }
    }
}
