package com.techlabs.structure;

public abstract class Structure {

	protected int num1;
	protected int num2;
	protected int num3;

	public abstract void calculate();

	public void addition() {
		num3 = num1 + num2;
		System.out.println(num3);
	}
}