package com.techlabs.decoratorpattern;

public class Systemin implements Display {
	Display inputTest;

	public Systemin(Display iDisplay) {
		this.inputTest = inputTest;
	}

	@Override
	public void display() {
		this.inputTest.display();
	}

}
