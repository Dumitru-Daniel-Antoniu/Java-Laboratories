package com.mycompany.laboratory7;

import java.util.Map;

public class Robot implements Runnable{
    private String name;
    private boolean running;
    Exploration explore;
    
    public Robot(String name) {
        this.name = name;
    }

    
    
    @Override
    public void run() {
        while (running) {
            
            explore.getMap().visit(row, col, this);
            
        } 
    }
}
