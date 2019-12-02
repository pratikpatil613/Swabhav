package com.techlabs.dogdoor1.randydogdoor;

public class BarkRecognizer {
	private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void recoginze(String bark) {
		System.out.println("Bark recoginzer heard:" + "'" + bark + "'");
		if (door.getAllowedBark().equals(bark)) {
			door.open();
		} else {

			System.out.println("This dog is not allwed");
		}
	}

}
