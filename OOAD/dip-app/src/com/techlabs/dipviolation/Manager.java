package com.techlabs.dipviolation;

public class Manager {
	Developer developer;
	Designer designer;

	public Manager(Developer developer) {
		this.developer = developer;
	}

	public Manager(Designer designer) {
		this.designer = designer;
	}

	public void watchDeveloperWork() {
		this.developer.work();
	}

	public void watchDesigmerWork() {
		this.designer.work();
	}

}
