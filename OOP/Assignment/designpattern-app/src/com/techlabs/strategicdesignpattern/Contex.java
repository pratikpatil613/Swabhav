package com.techlabs.strategicdesignpattern;

public class Contex {
	private Action action;

	public Contex(Action action) {
		this.action = action;
	}

	public void doActon() {
		action.performAction();
	}
}
