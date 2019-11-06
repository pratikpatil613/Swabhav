package com.techlabs.crudable;

public class CustomerDB implements ICrudable {

	public CustomerDB() {

	}

	@Override
	public void create() {
		System.out.println("adding customer");
	}

	@Override
	public void read() {
		System.out.println("Customer read");

	}

	@Override
	public void update() {
		System.out.println("Customer update");

	}

	@Override
	public void delete() {
		System.out.println("Customer delete");

	}

}
