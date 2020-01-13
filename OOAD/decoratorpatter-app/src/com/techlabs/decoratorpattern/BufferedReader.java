package com.techlabs.decoratorpattern;

public class BufferedReader extends NameDecorator {
	public BufferedReader(Display name) {
		super(name);
	}

	@Override
	public void displayName() {
		super.displayName();
	}

}
