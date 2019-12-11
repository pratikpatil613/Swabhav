package com.techlabs.unittest;

public class Calculator {

	public int add(int firstNumber, int secondNumber) throws Exception {
		if (firstNumber < 0 || secondNumber < 0) {
			throw new Exception("invalid number");
		}
		return firstNumber + secondNumber;

	}

}
