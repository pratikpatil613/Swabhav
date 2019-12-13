package com.techlabs.dipviolation.test;

import com.techlabs.dipviolation.LogType;
import com.techlabs.dipviolation.TaxCalculator;

public class DipViolationTest {
	public static void main(String[] args) {
		TaxCalculator cal = new TaxCalculator(LogType.TXT);
		System.out.println(cal.calculate(5, 0));

	}

}
