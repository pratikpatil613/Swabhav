package com.techlabs.adapterdesignpattern;

public class Youtube implements ISmartTv {

	@Override
	public void displayYoutube() {
		System.out.println("playing  Youtube");
	}

	@Override
	public void displayHotstar() {
	}

}
