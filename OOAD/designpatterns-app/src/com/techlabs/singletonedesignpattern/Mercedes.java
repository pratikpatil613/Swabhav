package com.techlabs.singletonedesignpattern;

public class Mercedes implements ICar {
	private double price = 2800000;

	@Override
	public double getPrice() {
		return price;
	}
}
