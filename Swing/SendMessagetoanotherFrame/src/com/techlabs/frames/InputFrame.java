package com.techlabs.frames;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class InputFrame extends JFrame {
	JLabel labelName;
	JTextField nameField;
	JButton nextButton;
	Container c;
//	String name;

	public InputFrame() {
		c = getContentPane();
		c.setLayout(null);

		labelName = new JLabel("Enter Name");
		labelName.setBounds(200, 230, 80, 50);

		nameField = new JTextField();
		nameField.setBounds(290, 230, 80, 50);

		nextButton = new JButton("Next");
		nextButton.setBounds(250, 300, 80, 50);

		c.add(labelName);
		c.add(nameField);
		c.add(nextButton);

		nextButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String name = nameField.getText();
				//System.out.println(name);

				OutputFrame outputFrame = new OutputFrame(name);
				
				outputFrame.setVisible(true);
			}
		});

	}

	public static void main(String[] args) {
		InputFrame frame = new InputFrame();
		frame.setTitle("InputFrame");
		frame.setSize(700, 700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
