package com.techlabs.dogdoor1;

public class DogDoorSimulator {
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		System.out.println("Fido barks to go outside...");
		recognizer.barkAnalyzer("woow");
		System.out.println("\nFido has gone outside...");
		System.out.println("\nFido's all done...");

		try {
			Thread.currentThread().sleep(10000);

		} catch (InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("....but he's stuck outside!");
		System.out.println("Fido Starts barking");
		recognizer.barkAnalyzer("woow");
		System.out.println("\nFido's back inside");
	}

}
