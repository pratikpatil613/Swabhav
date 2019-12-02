package com.techlabs.srp.refactor;

public class InvoiceConsol {
	Invoice invoice;

	public InvoiceConsol(Invoice invoice) {
		this.invoice = invoice;

	}

	public void print() {
		System.out.println("id:" + invoice.getId());
		System.out.println("Name:" + invoice.getProductName());
		System.out.println("discount:" + invoice.calculateDiscount());
		System.out.println("tax:" + invoice.calculateTax());
		System.out.println("cost:" + invoice.findCost());

	}

}
