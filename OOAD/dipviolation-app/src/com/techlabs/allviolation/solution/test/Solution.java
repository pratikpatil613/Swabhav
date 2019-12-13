package com.techlabs.allviolation.solution.test;

import com.techlabs.allvilolation.solution.TaxCalculator;
import com.techlabs.allvilolation.solution.TxtLogger;

public class Solution {
	public static void main(String[] args) {
		TaxCalculator tax = new TaxCalculator(new TxtLogger());
		System.out.println(tax.calculate(5, 0));
	}

}
