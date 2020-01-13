package com.techlabs.decoratorpattern;

public class InputTest implements Display {
	private String name;

	public InputTest(String name) {
		this.name = name;
	}

	@Override
	public void displayName() {
		System.out.println("Hello " + name);
	}
}