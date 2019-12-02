package com.techlabs.dogdoor1;

public class BarkRecognizer {
	private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void barkAnalyzer(String bark) {
		System.out.println("Bark recoginzer heard:" + "'" + bark + "'");
		door.open();
	}

}
