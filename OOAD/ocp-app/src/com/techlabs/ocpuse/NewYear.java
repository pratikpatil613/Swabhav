package com.techlabs.ocpuse;

public class NewYear implements IFestivalRate {
	double newYearRate=0.09;
	
	@Override
	public double getRate() {
		return newYearRate;
	}
	

}
