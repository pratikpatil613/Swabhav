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



}
