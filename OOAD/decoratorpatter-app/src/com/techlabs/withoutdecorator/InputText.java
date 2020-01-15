package com.techlabs.withoutdecorator;

public class InputText implements INameDisplay {
	String name;

	public InputText(String name) {
		this.name = name;
	}

	@Override
	public void displayName() {
		System.out.println("Hello  " + name);
	}

}
