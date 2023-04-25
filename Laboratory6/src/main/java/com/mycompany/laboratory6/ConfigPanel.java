package com.mycompany.laboratory6;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;

public class ConfigPanel extends JPanel{
    final MainFrame frame;
    JLabel dotsLabel, linesLabel, probabilityLabel;
    JSpinner dotsSpinner, linesSpinner;
    JComboBox linesCombo;
    JButton createButton;
    String probabilities[] = {"1.0", "2.0", "3.0", "4.0"};
    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }
    private void init() {
        dotsLabel = new JLabel("Number of dots:");
        linesLabel = new JLabel("Number of lines:");
        probabilityLabel = new JLabel("Line probability:");
        dotsSpinner = new JSpinner(new SpinnerNumberModel(6, 3, 100, 1));
        linesSpinner = new JSpinner(new SpinnerNumberModel(6, 3, 100, 1));
        linesCombo = new JComboBox(probabilities);
        createButton = new JButton("Create new game");
        add(dotsLabel);
        add(dotsSpinner);
        add(linesLabel);
        add(linesSpinner);
        add(probabilityLabel);
        add(linesCombo);
        add(createButton);
    }
}
