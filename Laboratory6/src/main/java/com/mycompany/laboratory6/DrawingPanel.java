package com.mycompany.laboratory6;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;

public class DrawingPanel extends JPanel {
    final MainFrame frame;
    final static int W = 800, H = 600;
    public DrawingPanel(MainFrame frame) {
        this.frame = frame;
        initPanel();
    }
    private void initPanel() {
        setPreferredSize(new Dimension(W, H));
        setBorder(BorderFactory.createEtchedBorder());
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
    }    
}
