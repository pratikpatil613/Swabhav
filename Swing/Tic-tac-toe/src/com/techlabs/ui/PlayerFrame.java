package com.techlabs.ui;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerFrame extends JFrame {
	JLabel player1Label;
	JLabel player2Label;
	JTextField Player1textField;
	JTextField player2JTextField;

	JButton okButton;

	Container c;

	public PlayerFrame() {
		c = getContentPane();
		c.setLayout(null);
		player1Label = new JLabel("First Player ");
		player1Label.setBounds(150, 150, 100, 50);

		player2Label = new JLabel("Second Player");
		player2Label.setBounds(150, 200, 120, 50);

		Player1textField = new JTextField();
		Player1textField.setBounds(280, 160, 100, 30);

		player2JTextField = new JTextField();
		player2JTextField.setBounds(280, 210, 100, 30);

		okButton = new JButton("OK");
		okButton.setBounds(230, 280, 70, 30);

		okButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String player1Name = Player1textField.getText();
				String player2Name = player2JTextField.getText();

				PlayBoard pBoard = new PlayBoard(player1Name, player2Name);
				dispose();
		

			}
		});

		c.add(player1Label);
		c.add(player2Label);
		c.add(Player1textField);
		c.add(player2JTextField);
		c.add(okButton);

	}

	public static void main(String[] args) {
		PlayerFrame playerFrmae = new PlayerFrame();
		playerFrmae.setTitle("Player");
		playerFrmae.setSize(500, 500);
		playerFrmae.setLocationRelativeTo(null);
		playerFrmae.setDefaultCloseOperation(EXIT_ON_CLOSE);
		playerFrmae.setVisible(true);

	}

}
