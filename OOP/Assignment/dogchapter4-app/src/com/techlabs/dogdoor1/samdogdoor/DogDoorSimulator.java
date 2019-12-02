package com.techlabs.dogdoor1.samdogdoor;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class DogDoorSimulator {
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		door.addAllowedBark(new Bark("rowlf"));
		door.addAllowedBark(new Bark("rooowlf"));
		door.addAllowedBark(new Bark("rawlf"));
		door.addAllowedBark(new Bark("wolf"));
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);

		System.out.println("Bruce barks to go outside...");
		recognizer.recognize(new Bark("rowlf"));
		System.out.println("\nBruce has gone outside...");

		try {
			Thread.currentThread().sleep(10000);

		} catch (InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("\nBruce's all done...");

		System.out.println("....but he's stuck outside!");

		Bark samllDogBark = new Bark("yip");
		System.out.println("small dog  Starts barking");
		recognizer.recognize(samllDogBark);

		try {
			Thread.currentThread().sleep(10000);

		} catch (InterruptedException ex) {
			System.out.println(ex.getMessage());
		}

		System.out.println("Bruce   Starts barking");
		recognizer.recognize(new Bark("rooowlf"));

		System.out.println("\nBruce back inside");
	}

}
