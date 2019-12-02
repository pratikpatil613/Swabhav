package com.techlabs.dogdoor1.samdogdoor;

import java.util.*;

public class BarkRecognizer {
	private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void recognize(Bark bark) {
		System.out.println("Bark recoginzer heard:" + "'" + bark.getSound() + "'");

		List allowedBarks = door.getAllowedBark();
		for (Iterator i = allowedBarks.iterator(); i.hasNext();) {
			Bark allowedBark = (Bark) i.next();

			if (allowedBark.equals(bark)) {
				door.open();
				return;
			}
		}

		System.out.println("This dog is not allwed");
	}

}
