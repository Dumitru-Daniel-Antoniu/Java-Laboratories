package drawing;

import structure.GraphComponents;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    VerticesSelector verticesSelector;

    EdgesSelector edgesSelector;

    final int height = 750;

    final int width = 1200;
    public MainFrame(int value, GraphComponents graph) {
        if(value == 1) {
            this.setTitle("Vertices of the graphs");
            initVertices();
        }
        if(value == 2) {
            this.setTitle("Edges of the graphs");
            initEdges(graph);
        }
    }

    private void initVertices() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        verticesSelector = new VerticesSelector(this);
        add(verticesSelector, BorderLayout.PAGE_START);
        pack();
    }

    private void initEdges(GraphComponents graph) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        edgesSelector = new EdgesSelector(this, graph);
        add(edgesSelector, BorderLayout.CENTER);
        pack();
    }
}
