package com.mycompany.laboratory7;

import java.util.List;
import java.util.ArrayList;

public class Exploration {
    private final SharedMemory mem = new SharedMemory();
    private final ExplorationMap map = new ExplorationMap(); 
    private final List<Robot> robots = new ArrayList<>();   
    
    public void start() {
        for (Robot robot : robots) {
            
        }
    }
    
    public void addRobot(Robot robot) {
        
    }
    
    public void getMap() {
        
    }
    
    public static void main(String args[]) {
        var explore = new Exploration();
        explore.addRobot(new Robot("Wall-E"));
        explore.addRobot(new Robot("R2D2"));
        explore.addRobot(new Robot("Optimus Prime"));
        explore.start();
    }
}
