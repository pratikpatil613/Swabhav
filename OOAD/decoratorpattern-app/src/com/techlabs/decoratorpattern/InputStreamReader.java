package com.techlabs.decoratorpattern;

public class InputStreamReader extends Systemin {

	public InputStreamReader(Display name) {
		super(name);
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("inputstream");
	}

}
