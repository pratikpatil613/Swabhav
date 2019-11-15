package com.techlabs.bug;

public class RuntimeExceptionPropagationTest {
	public static void main(String[] args) {
		System.out.println("inside main");
		m1();

		System.out.println("end of program");
	}

	static void m1() {
		System.out.println("inside m1");
		m2();

	}

	static void m2() {
		System.out.println("inside m2");
		m3();
	}

	static void m3() {
		System.out.println("inside m3");
		throw new RuntimeException();
	}

}
