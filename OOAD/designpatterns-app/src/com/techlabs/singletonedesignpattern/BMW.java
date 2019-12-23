package com.techlabs.singletonedesignpattern;

public class BMW implements ICar {
	private double price = 6400000;

	@Override
	public double getPrice() {
		return price;
	}

}
