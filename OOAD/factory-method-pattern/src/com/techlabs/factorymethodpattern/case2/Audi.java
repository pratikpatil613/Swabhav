package com.techlabs.factorymethodpattern.case2;

public class Audi implements IAutomobile, IAutomobileFactory {

	@Override
	public void start() {
		System.out.println("AUDI Start");
	}

	@Override
	public void stop() {
		System.out.println("AUDI Stop");
	}

	@Override
	public IAutomobile make() {
		return new Audi();
	}

	public static Audi getInstance() {
		return new Audi();
	}

}
