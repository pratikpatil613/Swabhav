package com.techlabs.factorymethodpattern.case3;

public class BMW implements IAutomobile, IAutomobileFactory {

	@Override
	public void start() {
		System.out.println("BMW Start");
	}

	@Override
	public void stop() {
		System.out.println("BMW Stop");
	}

	@Override
	public IAutomobile make() {
		return new BMW();
	}

	public static BMW getInstance() {
		return new BMW();
	}

}
