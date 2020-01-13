package com.techlabs.decoratorpattern;

public class NameDecorator implements Display {

	protected Display name;

	public NameDecorator(Display name) {
		this.name = name;
	}

	@Override
	public void displayName() {
		this.name.displayName();
		;
	}

}