package com.techlabs.guitarmadolin;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec WhatErinLikes = new GuitarSpec(Builder.COLLING, "st1", Type.Electric, 12, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		List matchingList = inventory.Search(WhatErinLikes);
		if (!matchingList.isEmpty()) {
			System.out.println("Erin You Might Like This:");
			for (Iterator i = matchingList.iterator(); i.hasNext();) {

				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = (GuitarSpec) guitar.getSpec();
				System.out.println("We have:" +

						guitar.getSerialNumber() + " " + spec.getBuilder() + " " + spec.getModel() + " " + ""
						+ spec.getType() + "Guitar \n" + spec.getBackWood() + " Back and side \n" + spec.getTopkWood()
						+ " Top \nYou can have it only" + guitar.getPrice() + "\n");

			}
		} else {
			System.out.println("Sorry Erin We have nothing for you!");
		}

		MandolinSpec WhatErinLikes2 = new MandolinSpec(Builder.COLLING, "st1", Type.Electric, Style.A, Wood.ADIRONDACK,
				Wood.ADIRONDACK);
		List matchingList2 = inventory.Search(WhatErinLikes2);
		if (!matchingList2.isEmpty()) {
			System.out.println("Erin You Might Like This:");
			for (Iterator i = matchingList2.iterator(); i.hasNext();) {

				Mandolin mandolin = (Mandolin) i.next();
				MandolinSpec spec2 = (MandolinSpec) mandolin.getSpec();
				System.out.println("We have:" +

						mandolin.getSerialNumber() + " " + spec2.getBuilder() + " " + spec2.getModel() + " " + ""
						+ spec2.getType() + "Guitar \n" + spec2.getBackWood() + " Back and side \n"
						+ spec2.getTopkWood() + " Top \nYou can have it only" + mandolin.getPrice() + "\n");

			}
		} else {
			System.out.println("Sorry Erin We have nothing for you!");
		}

	}

	private static void initializeInventory(Inventory inventory) {

		inventory.addInstrument("102", 10000,
				new MandolinSpec(Builder.COLLING, "st1", Type.Electric, Style.A, Wood.ADIRONDACK, Wood.ADIRONDACK));

		inventory.addInstrument("101", 14000,
				new GuitarSpec(Builder.FENDER, "1", Type.Acoustic, 10, Wood.ALDER, Wood.ALDER));
		inventory.addInstrument("102", 20000,
				new GuitarSpec(Builder.COLLING, "st1", Type.Electric, 12, Wood.ADIRONDACK, Wood.ADIRONDACK));
		inventory.addInstrument("103", 250000,
				new GuitarSpec(Builder.FENDER, "1", Type.Acoustic, 10, Wood.ALDER, Wood.ALDER));
		inventory.addInstrument("104", 150000,
				new GuitarSpec(Builder.COLLING, "st1", Type.Electric, 12, Wood.ADIRONDACK, Wood.ADIRONDACK));

	}

}
