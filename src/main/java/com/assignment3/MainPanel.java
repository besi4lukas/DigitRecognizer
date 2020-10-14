package com.assignment3;

import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.*;

public class MainPanel extends JPanel {
	private final MenuPanel panel_menu;
	private final DrawAndDigitPredictionPanel panel_drawAndDigitPrediction;
	    
	public MainPanel() throws IOException {
		panel_drawAndDigitPrediction = new DrawAndDigitPredictionPanel();
		panel_menu = new MenuPanel();
		panel_menu.linkUserInteractionPanel(panel_drawAndDigitPrediction) ;
		panel_menu.linkNeuralNetwork(new NeuralNetwork());
		panel_menu.linkConvolutionalNeuralNetwork(new ConvolutionalNeuralNetwork());
		this.setLayout(new BorderLayout());
        this.add(panel_menu, BorderLayout.WEST);
        this.add(panel_drawAndDigitPrediction, BorderLayout.CENTER);
	}
}
