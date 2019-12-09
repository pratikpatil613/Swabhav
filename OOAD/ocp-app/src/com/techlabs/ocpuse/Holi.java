package com.techlabs.ocpuse;

public class Holi implements IFestivalRate {
	private double holiRate=0.08;
	@Override
	public double getRate() {
		return holiRate;
	}

}
