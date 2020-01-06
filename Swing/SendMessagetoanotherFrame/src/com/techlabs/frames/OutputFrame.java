package com.techlabs.frames;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class OutputFrame extends JFrame {

	JLabel outputLabel;
	Container c;
	InputFrame iFrame;
	String name;

	public OutputFrame(String name) {
		c = getContentPane();
		c.setLayout(null);

		outputLabel = new JLabel();
		outputLabel.setBounds(200, 250, 1000, 30);

		//System.out.println(name);
		outputLabel.setText("Hello " + name);

		c.add(outputLabel);

		setTitle("Output Frame");
		setSize(700, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	/*
	 * public static void main(String[] args) { OutputFrame frame = new
	 * OutputFrame();
	 * 
	 * }
	 */

}
