package com.techlabs.factorymethodpattern.case3;

public class Tesla implements IAutomobile, IAutomobileFactory {

	@Override
	public void start() {
		System.out.println("Tesla start");
	}

	@Override
	public void stop() {
		System.out.println("Tesla stop");
	}

	@Override
	public IAutomobile make() {
		return new Tesla();
	}

	public static Tesla getInstance() {
		return new Tesla();
	}

}
