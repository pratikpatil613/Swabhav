package com.techlabs.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrintHello implements ActionListener {
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("print Hello");
	}

}
