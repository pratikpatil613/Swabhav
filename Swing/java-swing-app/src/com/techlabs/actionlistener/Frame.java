package com.techlabs.actionlistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
	Container c;
	JLabel label;
	JButton button;
	// JTextField field;

	public Frame() {
		c = getContentPane();
		c.setLayout(null);
		label = new JLabel("Software developer");
		label.setBounds(200, 100, 150, 50);
		label.setForeground(Color.WHITE);

		button = new JButton("PrintMenu");
		button.setBounds(210, 150, 100, 30);
		c.add(label);
		c.add(button);
		// c.add(field);
		c.setBackground(Color.blue);

		button.addActionListener(new PrintGoodBye());

		button.addActionListener(new PrintHello());

	}

}
