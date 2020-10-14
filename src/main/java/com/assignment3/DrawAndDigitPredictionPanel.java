package com.assignment3;

import javax.swing.*;
import java.awt.*;

public class DrawAndDigitPredictionPanel extends JPanel{
	
    private final DrawArea panel_drawArea;
    private final JPanel panel_result;
    
    public DrawAndDigitPredictionPanel() {
        panel_drawArea = new DrawArea();
        panel_result = new JPanel();
        panel_result.setLayout(new GridBagLayout());
        this.setLayout(new GridLayout());
        this.add(panel_drawArea) ;
        this.add(panel_result);
    }
    
    public void clearArea() {
        panel_drawArea.setImage(null);
        panel_drawArea.repaint();
        panel_drawArea.updateUI();
        panel_result.removeAll();
        panel_result.updateUI();
    }
    
    public Image getImageinDrawArea() {
        return panel_drawArea.getImage();
    }
    
    public void drawNumber(LabeledImage arg_labeledImage) {
        JLabel predictNumber = new JLabel("" + arg_labeledImage);
        predictNumber.setForeground(Color.RED);
        predictNumber.setFont(new Font("SansSerif", Font.BOLD, 128));
        panel_drawArea.add(predictNumber);
    }
    
    public void drawNumber(int arg_number) {
        JLabel predictNumber = new JLabel("" + arg_number);
        predictNumber.setForeground(Color.RED);
        predictNumber.setFont(new Font("SansSerif", Font.BOLD, 128));
        panel_drawArea.add(predictNumber);
    }
    
    
}
