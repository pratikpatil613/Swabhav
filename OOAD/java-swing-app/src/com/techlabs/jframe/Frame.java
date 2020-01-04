package com.techlabs.jframe;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class Frame extends JFrame {
	Container c;
	JLabel label;

	public Frame() {
		c = getContentPane();
		c.setLayout(null);
		label = new JLabel("Software developer");
		label.setBounds(200, 100, 150, 50);
		label.setForeground(Color.WHITE);

		c.add(label);
		c.setBackground(Color.blue);

	}

}
