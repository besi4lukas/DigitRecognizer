package com.assignment3;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class UI extends JFrame {
	
    private static final int FRAME_WIDTH = 1200;
    private static final int FRAME_HEIGHT = 628;

    private JPanel panel_main;
    private JProgressBar progressBar;
    
    public UI() throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        UIManager.put("Button.font", new FontUIResource(new Font("Dialog", Font.BOLD, 18)));
        UIManager.put("ProgressBar.font", new FontUIResource(new Font("Dialog", Font.BOLD, 18)));
    }
    
    public void initUI() {
        
        this.setTitle("Digit Recognizer");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setLocationRelativeTo(null);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
        ImageIcon imageIcon = new ImageIcon("icon.png");
        this.setIconImage(imageIcon.getImage());

        panel_main = new MainPanel();

        addSignature();
        
        this.add(new TopPanel(), BorderLayout.NORTH);
        this.add(panel_main, BorderLayout.CENTER);
        this.setVisible(true);

    }
    
    private void addSignature() {
        JLabel signature = new JLabel("Modified by Kinglsey and Vishwad", JLabel.HORIZONTAL);
        signature.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        signature.setForeground(Color.BLUE);
        panel_main.add(signature, BorderLayout.SOUTH);
    }
    
    public void createProgressBar(String arg_displayMessage) {
        progressBar = new JProgressBar(JProgressBar.HORIZONTAL);
        //progressBar.setVisible(false);
        this.setUndecorated(true);
        this.add(progressBar, BorderLayout.NORTH);
        progressBar.setString(arg_displayMessage);
        progressBar.setStringPainted(true);
        progressBar.setIndeterminate(true);
        progressBar.setVisible(true);
    }
    
}
