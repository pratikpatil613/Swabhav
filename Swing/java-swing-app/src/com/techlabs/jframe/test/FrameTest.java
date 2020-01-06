package com.techlabs.jframe.test;


import java.awt.Color;

import com.techlabs.jframe.Frame;

public class FrameTest {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setSize(500, 500);
		frame.setTitle("Pratik");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
