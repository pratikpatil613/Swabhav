package com.techlabs.custom.exceptiontest;

import com.techlabs.custom.exception.PratikException;

public class CustomExceptionTest {
	public static void main(String[] args) {

		try {
			printOddNumber(4);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static void printOddNumber(int numberInput) throws PratikException {

		if (!(numberInput % 2 == 0))
			System.out.println(numberInput);
		else

			throw new PratikException("EvenNumberException");
	}

}
