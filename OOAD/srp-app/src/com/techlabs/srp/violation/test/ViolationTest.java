package com.techlabs.srp.violation.test;

import com.techlabs.srp.violation.Invoice;

public class ViolationTest {
	public static void main(String[] args) {
		Invoice i1 = new Invoice(101, "abc", 5000, 500);

		i1.print(i1);

	}

}
