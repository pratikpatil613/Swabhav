package com.techlabs.allvilolation.solution;

public class TxtLogger implements ILoger {

	@Override
	public void log(String msg) {

		System.out.println(msg);

	}

}
