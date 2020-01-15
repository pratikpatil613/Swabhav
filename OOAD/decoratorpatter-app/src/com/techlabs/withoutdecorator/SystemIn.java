package com.techlabs.withoutdecorator;

public class SystemIn implements INameDisplay {
	INameDisplay nameDisplay;

	public SystemIn(INameDisplay nameDisplay) {
		this.nameDisplay = nameDisplay;
	}

	@Override
	public void displayName() {
		this.nameDisplay.displayName();

	}

}
