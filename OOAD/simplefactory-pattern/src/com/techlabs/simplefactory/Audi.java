package com.techlabs.simplefactory;

class Audi implements IAutomobile {

	@Override
	public void start() {
		System.out.println("AUDI Start");
	}

	@Override
	public void stop() {
		System.out.println("AUDI Stop");
	}

}
