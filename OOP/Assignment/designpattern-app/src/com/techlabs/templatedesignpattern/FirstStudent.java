package com.techlabs.templatedesignpattern;

public class FirstStudent extends Education {

	@Override
	public void completeDiploma() {
		System.out.println("then diploma");
	}

	@Override
	public void comleteSSC() {
		System.out.println("First completed ssc");

	}

	@Override
	public void completeDegree() {
		System.out.println("and finaly completed degree");

	}

}