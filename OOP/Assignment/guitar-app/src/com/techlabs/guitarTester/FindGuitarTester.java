package com.techlabs.guitarTester;

import org.omg.CORBA.INITIALIZE;

import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.Inventory;

public class FindGuitarTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Guitar WhatErinLikes = new Guitar("101", "fender", "1", "startocastor", "elder", "elder", 14000);
		Guitar guitar = inventory.Search(WhatErinLikes);
		if (guitar != null) {
			System.out.println("Erin You Might Like This:" + guitar.getBuilder() + "" + guitar.getSerialNumber() + ""
					+ guitar.getModel() + "" + guitar.getPrice() + "" + guitar.getType() + guitar.getBackWood() + ""
					+ guitar.getTopWood());
		} else {
			System.out.println("Sorry Erin We have nothing for you!");
		}

	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("101", "fender", "1", " startocastor", "elder", "elder", 140000);
		inventory.addGuitar("102", "Bestselle", "st1", "electric", "solid", "laminate", 20000);

	}

}
