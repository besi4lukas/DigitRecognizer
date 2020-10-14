package com.assignment3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.concurrent.Executors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TopPanel extends JPanel implements ActionListener {
	
    private final static Logger LOGGER = LoggerFactory.getLogger(UI.class);
    private final JButton button_trainNN = new JButton("Train NN");
    private final JButton button_trainCNN= new JButton("Train Convolutional NN");
    private UI reference_userInterface;

    
    public TopPanel() {
        this.setLayout(new FlowLayout()); 
        button_trainNN.addActionListener(this);
        button_trainCNN.addActionListener(this);
        this.add(button_trainNN);
        this.add(button_trainCNN);
    }
    
    public TopPanel(UI arg_userInterface) {
        
        this.setLayout(new FlowLayout());
        reference_userInterface = arg_userInterface;
        
        button_trainNN.addActionListener(this);
        button_trainCNN.addActionListener(this);
                     
        this.add(button_trainNN);
        this.add(button_trainCNN);

    }
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == button_trainNN) {
            int i = JOptionPane.showConfirmDialog(reference_userInterface, "Are you sure this may take some time to train?");

//            if (i == JOptionPane.OK_OPTION) {
//                ProgressBar progressBar = new ProgressBar(mainFrame);
//                SwingUtilities.invokeLater(() -> progressBar.showProgressBar("Training may take one or two minutes..."));
//                Executors.newCachedThreadPool().submit(() -> {
//                    try {
//                        LOGGER.info("Start of train Neural Network");
//                        arg_neuralnet.train(60000, 10000);
//                        LOGGER.info("End of train Neural Network");
//                    } finally {
//                        progressBar.setVisible(false);
//                    }
//                });
//            }
        }
        
        if (arg0.getSource() == button_trainCNN) {
            int i = JOptionPane.showConfirmDialog(reference_userInterface, "Are you sure, training requires >10GB memory and more than 1 hour?");

//            if (i == JOptionPane.OK_OPTION) {
//                ProgressBar progressBar = new ProgressBar(mainFrame);
//                SwingUtilities.invokeLater(() -> progressBar.showProgressBar("Training may take a while..."));
//                Executors.newCachedThreadPool().submit(() -> {
//                    try {
//                        LOGGER.info("Start of train Convolutional Neural Network");
//                        arg_convNeuralnet.train(60000, 10000);
//                        LOGGER.info("End of train Convolutional Neural Network");
//                    } catch (IOException e1) {
//                        LOGGER.error("CNN not trained " + e1);
//                        throw new RuntimeException(e1);
//                    } finally {
//                        progressBar.setVisible(false);
//                    }
//                });
//            }            
        }
		
	}

}
