package com.techlabs.ocpuse;

public class Normal implements IFestivalRate {
	double nornmalRate = 0.07;

	@Override
	public double getRate() {
		return nornmalRate;
	}

}
