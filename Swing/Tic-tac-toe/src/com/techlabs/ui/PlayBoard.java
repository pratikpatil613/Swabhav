package com.techlabs.ui;

import javax.swing.*;

import com.techlabs.testdrivendevelopment.Board;
import com.techlabs.testdrivendevelopment.Game;
import com.techlabs.testdrivendevelopment.MarkType;
import com.techlabs.testdrivendevelopment.Player;
import com.techlabs.testdrivendevelopment.ResultAnalyzer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayBoard extends JFrame {

	JLabel currentPlayer, status;
	JTextField currentPlayerTxtField, statusField;
	JButton[][] buttons = new JButton[3][3];
	Container c;
	JPanel buttonArray;
	int z = 1;

	public PlayBoard(String player1, String player2) {

		Board board = new Board(3, 3);
		Player[] players = { new Player(player1, MarkType.X), new Player(player2, MarkType.O) };
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		Game game = new Game(players, board, analyzer);

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

		currentPlayerTxtField = new JTextField(game.getCurrentPlayer().getName());
		currentPlayerTxtField.setBounds(510, 110, 100, 30);

		statusField = new JTextField();
		statusField.setBounds(510, 160, 100, 30);
		try {
			for (int i = 0; i < buttons.length; i++) {
				for (int j = 0; j < buttons.length; j++) {
					buttons[i][j] = new JButton(Integer.toString(z++));
					buttonArray.add(buttons[i][j]);
					String bText = buttons[i][j].getText();
					Integer innerI = new Integer(i);
					final Integer innerJ = new Integer(j);
					buttons[i][j].addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							System.out.println(bText);
							if (!analyzer.analyzeResult().name().equals("win"))
								try {
									//buttons[innerI][innerJ].setText(game.getCurrentPlayer().getMarkType().name());
									game.Play(innerI, innerJ);
									buttons[innerI][innerJ].setText(board.getCell(innerI, innerJ).getMark().name());
									currentPlayerTxtField.setText(game.getCurrentPlayer().getName());
									statusField.setText(analyzer.analyzeResult().name());

								} catch (Exception e1) {
									JOptionPane.showMessageDialog(null, e1.getMessage());
								}
						}

					});
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

		c.add(currentPlayer);
		c.add(status);
		c.add(currentPlayerTxtField);
		c.add(statusField);

		setTitle("PlayBoard");
		setSize(700, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		PlayBoard playBoard = new PlayBoard("Pratik", "Aniket");

	}

}
