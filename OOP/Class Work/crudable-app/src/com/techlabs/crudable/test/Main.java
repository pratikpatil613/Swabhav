package com.techlabs.crudable.test;

import com.techlabs.crudable.AddressDB;
import com.techlabs.crudable.CustomerDB;
import com.techlabs.crudable.ICrudable;
import com.techlabs.crudable.InvoiceDB;

public class Main {
	public static void main(String[] args) {

		doDbOperations(new InvoiceDB());
		doDbOperations(new CustomerDB());
		doDbOperations(new AddressDB());

	}

	private static void doDbOperations(ICrudable x) {
		System.out.println("Doing Different DB Operations:");

		x.create();
		x.read();
		x.update();
		x.delete();

	}

}