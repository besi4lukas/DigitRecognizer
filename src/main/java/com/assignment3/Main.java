package com.assignment3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import javax.swing.*;
//import java.util.concurrent.Executors;
//import javax.swing.*;
//import java.util.concurrent.Executors;

public class Main {
	private final static Logger LOGGER = LoggerFactory.getLogger(Main.class);
	 
	public static void main(String[] args) throws Exception {
		LOGGER.info("Application is starting ... ");
		
		UI ui = new UI();
		ui.initUI();

	}

}
