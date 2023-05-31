package drawing;

import structure.GraphComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class VerticesSelector extends JPanel{

    final MainFrame frame;

    JSpinner firstGraphSpinner, secondGraphSpinner;

    JLabel firstEnumeration, secondEnumeration;

    JButton button;

    public VerticesSelector(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        firstEnumeration = new JLabel("Number of vertices for the first graph: ");
        secondEnumeration = new JLabel("Number of vertices for the second graph: ");
        firstGraphSpinner = new JSpinner(new SpinnerNumberModel(3,1,10,1));
        secondGraphSpinner = new JSpinner(new SpinnerNumberModel(3,1,10,1));
        button = new JButton("Next");
        add(firstEnumeration);
        add(firstGraphSpinner);
        add(secondEnumeration);
        add(secondGraphSpinner);
        add(button);
        button.addActionListener(this::getFirstEdges);
    }

    private void getFirstEdges(ActionEvent ae) {
        GraphComponents graph1 = new GraphComponents();
        graph1.setNumberOfVertices((Integer) firstGraphSpinner.getValue());
        graph1.setVertices();
        GraphComponents graph2 = new GraphComponents();
        graph2.setNumberOfVertices((Integer) secondGraphSpinner.getValue());
        graph2.setVertices();
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        MainFrame newFrame = new MainFrame(2, graph1);
        newFrame.setSize(new Dimension(1200, 700));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        newFrame.setLocation(dim.width/2-newFrame.getSize().width/2, dim.height/2-newFrame.getSize().height/2);
        newFrame.setVisible(true);
    }
}
