package com.assignment3;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class MenuPanel extends JPanel implements ActionListener{
    private final JButton button_recognizeNN = new JButton("Recognize Digit With Simple NN");
    private final JButton button_recognizeCNN = new JButton("Recognize Digit With Conv NN");
    private final JButton button_clear = new JButton("Clear");
    private NeuralNetwork ref_nn ; 
    private ConvolutionalNeuralNetwork ref_cnn; 
    private DrawAndDigitPredictionPanel panel_drawAndResult;
    
    public MenuPanel(){
        this.setLayout(new GridLayout(8, 1));
        button_recognizeNN.addActionListener(this);
        button_recognizeCNN.addActionListener(this);
        button_clear.addActionListener(this);
        this.add(button_recognizeNN);
        this.add(button_recognizeCNN);
        this.add(button_clear);
    }
    
    public void linkNeuralNetwork(NeuralNetwork arg_neuralNetwork) {
        ref_nn = arg_neuralNetwork;
        ref_nn.init();
    }
    
    public void linkConvolutionalNeuralNetwork( ConvolutionalNeuralNetwork arg_convolutionalNeuralNetwork) throws IOException {
        ref_cnn = arg_convolutionalNeuralNetwork;
        ref_cnn.init();
    }
    
    public void linkUserInteractionPanel(DrawAndDigitPredictionPanel arg_userInteractionPanel) {
        panel_drawAndResult = arg_userInteractionPanel;
    }
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
        // try and implement a strategy pattern over here
        if (arg0.getSource() == button_recognizeNN) {
            Image image_drawArea = panel_drawAndResult.getImageinDrawArea();
            LabeledImage labeledImage = ImageProcess.processImage(image_drawArea);
            LabeledImage predict = ref_nn.predict(labeledImage);
            panel_drawAndResult.drawNumber(predict);
        }
        if (arg0.getSource() == button_recognizeCNN) {
            Image image_drawArea = panel_drawAndResult.getImageinDrawArea();
            LabeledImage labeledImage = ImageProcess.processImage(image_drawArea);
            int predict = ref_cnn.predict(labeledImage);
            panel_drawAndResult.drawNumber(predict);
        }
        if (arg0.getSource() == button_clear) {
            panel_drawAndResult.clearArea();
        }
		
	}

}
