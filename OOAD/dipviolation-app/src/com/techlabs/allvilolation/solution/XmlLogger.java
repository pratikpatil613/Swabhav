package com.techlabs.allvilolation.solution;

public class XmlLogger implements ILoger {

	@Override
	public void log(String msg) {
		System.out.println("msg from xmllogger");

		System.out.println(msg);

	}
}
