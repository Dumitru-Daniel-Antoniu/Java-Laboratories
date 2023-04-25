package com.mycompany.homeworklaboratory5;

import java.awt.Desktop;
import java.io.*;

public class ViewCommand implements CommandClass {
    @Override
    public void doCommand(Catalog catalog, Document document, String path) {
        try {
            File file = new File(path);
            if(!Desktop.isDesktopSupported()) {
                System.out.println("Desktop is not supported");
            }
            Desktop desktop = Desktop.getDesktop();
            if(file.exists()) {
                desktop.open(file);
            }
        }
        catch(IOException ex) {
            System.out.println("Something went wrong at Input/Output.");
        }
    }
}
