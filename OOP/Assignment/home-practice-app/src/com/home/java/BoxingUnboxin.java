package com.home.java;

public class BoxingUnboxin {
	public static void main(String[] args) {
		int num = 100;

		Integer number = new Integer(num);
		System.out.println(number);
		

		Integer newNumber = num;
		System.out.println(newNumber);

		int newNum = number.intValue();
		System.out.println(newNum);

		int anotherNum = number;
		System.out.println(anotherNum);

	}

}
