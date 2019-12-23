package com.techlabs.factorydesignpattern;

public class BMW implements ICar {
	private double price = 64000000;

	@Override
	public double getPrice() {
		return price;
	}

}
