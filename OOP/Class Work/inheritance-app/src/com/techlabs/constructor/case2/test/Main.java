package com.techlabs.constructor.case2.test;

import com.techlabs.constructor.case2.Child;

public class Main {
	public static void main(String[] args) {
		Child c1 = new Child(500);
		Child c2 = new Child(300);

		printFoo(c1);
		printFoo(c2);

	}

	public static void printFoo(Child c) {
		System.out.println(c.getFoo());
	}

}
