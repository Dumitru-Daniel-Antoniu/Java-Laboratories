package com.mycompany.laboratory6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.GridLayout;
import java.awt.*;
import java.awt.event.*;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton exitBtn = new JButton("Exit");
    JButton loadBtn = new JButton("Load");
    JButton saveBtn = new JButton("Save");
    JButton resetBtn = new JButton("Reset");
    
    public ControlPanel(MainFrame frame) {
        this.frame= frame; 
        init();
    }
    
    private void init() {
        setLayout(new GridLayout(1, 4));
        add(exitBtn);
        add(loadBtn);
        add(saveBtn);
        add(resetBtn);
        exitBtn.addActionListener(this::exitGame);
        loadBtn.addActionListener(this::loadGame);
        saveBtn.addActionListener(this::saveGame);
        resetBtn.addActionListener(this::resetGame);
    }
    private void exitGame(ActionEvent ae) {
        frame.dispose();
    }
    private void loadGame(ActionEvent ae) {
        
    }
    private void saveGame(ActionEvent ae) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showSaveDialog(this);
        File file = fileChooser.getSelectedFile();
        try {
            FileWriter fileWriter = new FileWriter(file);
            
        }
        catch(IOException ex) {
            System.out.println(ex);
        }
    } 
    private void resetGame(ActionEvent ae) {
        
    }
 }
