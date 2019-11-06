package com.techlabs.crudable;

public class InvoiceDB implements ICrudable {

	public InvoiceDB() {
	}

	@Override
	public void create() {
		System.out.println("invoice create");

	}

	@Override
	public void read() {
		System.out.println("invoice read");

	}

	@Override
	public void update() {
		System.out.println("invoice update");

	}

	@Override
	public void delete() {
		System.out.println("invoice delete");

	}

}
