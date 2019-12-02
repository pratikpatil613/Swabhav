package com.techlabs.srp.refactor;

public class RefactorTest {
	public static void main(String[] args) {
		InvoiceConsol print = new InvoiceConsol(new Invoice(101, "xyz", 5000, 500));
		InvoiceFileWriter writer=new InvoiceFileWriter(new Invoice(405,"pqr",4000, 400));
		print.print();
		writer.write();

	}

}
