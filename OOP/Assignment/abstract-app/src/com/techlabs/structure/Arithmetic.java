package com.techlabs.structure;

public class Arithmetic extends Structure {

	public Arithmetic(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void calculate() {
		num3 = num1 - num2;
		System.out.println(num3);
	}

}
