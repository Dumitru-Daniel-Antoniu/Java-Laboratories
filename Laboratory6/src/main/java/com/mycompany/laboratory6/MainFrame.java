package com.mycompany.laboratory6;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import javax.swing.JPanel;
import javax.swing.JFrame;
//import javax.swing.ConfigPanel;
//import java.awt.*;
//import javax.util.config.ConfigPanel;

public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;    
    public MainFrame() {
        super("My Drawing Application");
        init();
    }
    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        canvas = new DrawingPanel(this);
        configPanel = new ConfigPanel(this);
        controlPanel = new ControlPanel(this);
        add(canvas, BorderLayout.CENTER);
        add(configPanel,BorderLayout.PAGE_START);
        add(controlPanel,BorderLayout.PAGE_END);
        pack();
    }
}
