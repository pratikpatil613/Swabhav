package UI;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayBoard extends JFrame {

	JLabel currentPlayer, status;
	JTextField playerTextField, statusField;
	JButton[][] buttons = new JButton[3][3];
	Container c;
	JPanel buttonArray;
	int z = 1;


	public PlayBoard(String player1, String player2) {
		c = getContentPane();
		c.setLayout(null);

		buttonArray = new JPanel();
		c.add(buttonArray);

		buttonArray.setLayout(new GridLayout(3, 3));
		buttonArray.setBounds(100, 100, 300, 300);

		currentPlayer = new JLabel("Current Player");
		currentPlayer.setBounds(420, 100, 100, 50);

		status = new JLabel("status");
		status.setBounds(440, 150, 80, 50);

		playerTextField = new JTextField();
		playerTextField.setBounds(510, 110, 100, 30);

		statusField = new JTextField();
		statusField.setBounds(510, 160, 100, 30);

		for (int i = 0; i < buttons.length; i++) {

			for (int j = 0; j < buttons.length; j++) {
				buttons[i][j] = new JButton(Integer.toString(z++));
				buttonArray.add(buttons[i][j]);
				String bText = buttons[i][j].getText();
				buttons[i][j].addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println(bText);
					}
				});
			}
		}

		c.add(currentPlayer);
		c.add(status);
		c.add(playerTextField);
		c.add(statusField);

		setTitle("PlayBoard");
		setSize(700, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		// PlayBoard playBoard = new PlayBoard();

	}

}
