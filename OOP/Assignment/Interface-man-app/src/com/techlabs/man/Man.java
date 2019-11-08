package com.techlabs.man;

public class Man implements IMannerable {

	@Override
	public void wish() {
		System.out.println("man wish");
	}

	@Override
	public void depart() {
		System.out.println("man depart");

	}

}
