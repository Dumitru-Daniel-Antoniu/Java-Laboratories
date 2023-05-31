package drawing;

import com.sun.tools.javac.Main;
import structure.GraphComponents;

import javax.swing.*;
import java.awt.*;

public class EdgesSelector extends JPanel {

    final MainFrame frame;

    GraphComponents graph;

    public EdgesSelector(MainFrame frame, GraphComponents graph) {
        this.frame = frame;
        this.graph = graph;
        init();
    }

    private void init() {
        int height, width;
        height = 700;
        width = 10;
        for(int i = 1; i <= graph.getNumberOfVertices(); i++) {
            for(int j = i + 1; j <= graph.getNumberOfVertices(); i++) {
                JCheckBox edge = new JCheckBox(i + " " + j);
                edge.setBounds(width, height, 30, 30);
                add(edge);
                height += 40;
            }
            height = 700;
            width += 30;
        }
    }

}
