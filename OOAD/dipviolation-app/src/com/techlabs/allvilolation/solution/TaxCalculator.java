package com.techlabs.allvilolation.solution;

public class TaxCalculator {
	private ILoger loger;

	public TaxCalculator(ILoger loger) {
		this.loger = loger;
	}

	public int calculate(int amount, int rate) {
		try {
			int cal = amount / rate;
			return rate;
		} catch (Exception e) {
			String message = e.getMessage();
			loger.log(message);
		}
		return -1;

	}

}
