package com.mycompany.homeworklaboratory5;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class SaveCommand implements CommandClass {
    @Override
    public void doCommand(Catalog catalog, Document document, String path) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(path), catalog);
        }
        catch(IOException ex) {
            System.out.println("Catalog was not saved in a JSON file.");
        }
    }
}
