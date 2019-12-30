package com.techlabs.factroymethodpattern;

class BMW implements IAutomobile {

	@Override
	public void start() {
		System.out.println("BMW Start");
	}

	@Override
	public void stop() {
		System.out.println("BMW Stop");
	}

}
