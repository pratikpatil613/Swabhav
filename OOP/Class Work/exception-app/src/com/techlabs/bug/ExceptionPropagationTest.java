package com.techlabs.bug;

public class ExceptionPropagationTest {
	public static void main(String[] args) {

		try {

			m1();
		} catch (Exception ex) {

			ex.printStackTrace();
		}

		System.out.println("end of program");
	}

	static void m1() throws Exception {
		System.out.println("inside m1");
		m2();

	}

	static void m2() throws Exception {
		System.out.println("inside m2");
		m3();

	}

	static void m3() throws Exception {
		System.out.println("inside m3");
		throw new Exception("exception from m3");
	}
}
