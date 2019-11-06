package com.techlabs.crudable;

public class AddressDB implements ICrudable {

	public AddressDB() {
	}

	@Override
	public void create() {
		System.out.println("AddressDB crating");
	}

	@Override
	public void read() {
		System.out.println("AddressDB reading");

	}

	@Override
	public void update() {
		System.out.println("AddressDB updatin");

	}

	@Override
	public void delete() {
		System.out.println("AddressDB deleting");

	}

}
