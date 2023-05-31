package main;

import drawing.*;
import structure.*;
import algorithms.*;
import java.awt.*;

public class Isomorphism {
    public static void main(String[] args) {
        GraphComponents graph1 = new GraphComponents(4,5);
        graph1.setVertices();
        GraphComponents graph2 = new GraphComponents(4,5);
        graph2.setVertices();
        if(graph1.verifyNumberOfEdges() == 1 && graph2.verifyNumberOfEdges() == 1) {
            System.out.println("Introduce the edges for graph1: ");
            graph1.setEdges();
            System.out.println("Introduce the edges for graph2: ");
            graph2.setEdges();
            if(graph1.setAdjacencyMatrix() == 1 && graph2.setAdjacencyMatrix() == 1) {
                graph1.setDegrees();
                graph2.setDegrees();
                Matrix matrix = new Matrix();
                if(matrix.verifyIsomorphism(graph1, graph2) == 1) System.out.println("The graphs are isomorphic");
                else System.out.println("The graphs are not isomorphic");
            }
        }
//        MainFrame frame = new MainFrame(1, null);
//        frame.setSize(new Dimension(1200, 700));
//        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
//        frame.setVisible(true);
    }
}
