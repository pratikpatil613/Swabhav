package com.techlabs.guitar;

import java.util.*;

public class Inventory {
	private List Guitars;

	public Inventory() {
		Guitars = new LinkedList();
	}

	public void addGuitar(String serialNumber, String builder, String model, String type, String backWood,
			String topWood, double price) {
		Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
		Guitars.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator i = Guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;

	}

	public Guitar Search(Guitar Searchguitar) {
		for (Iterator i = Guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();

			String builder = Searchguitar.getBuilder();
			if ((builder != null) && (!(builder == "")) && !(builder.equals(guitar.getBuilder())))

				continue;

			String model = Searchguitar.getModel();
			if ((model != null) && (!(model == "")) && !(model.equals(guitar.getModel())))

				continue;

			String type = Searchguitar.getType();
			if ((type != null) && (!(type == "")) && !(type.equals(guitar.getType())))

				continue;

			String backWood = Searchguitar.getBackWood();
			if ((backWood != null) && (!(backWood == "")) && !(type.equals(guitar.getBackWood())))

				continue;

			String topWood = Searchguitar.getType();
			if ((topWood != null) && (!(topWood == "")) && !(type.equals(guitar.getTopWood())))

				continue;
		}
		return null;

	}

}
