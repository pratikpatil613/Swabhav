package com.techlabs.decoratorpattern;

public class NameDecorator implements Display {
	protected Display name;

	public NameDecorator(Display name) {
		this.name = name;
	}

	@Override
	public void display() {
		this.name.display();
	}

}
