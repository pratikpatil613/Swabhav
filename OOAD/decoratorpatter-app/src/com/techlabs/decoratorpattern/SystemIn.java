package com.techlabs.decoratorpattern;

public class SystemIn extends NameDecorator {

	public SystemIn(Display c) {
		super(c);
	}

	@Override
	public void displayName() {
		super.displayName();
	}
}