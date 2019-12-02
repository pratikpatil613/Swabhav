package com.techlabs.dogdoor1.randydogdoor;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;
	private String allowedBark;

	public DogDoor() {
		this.open = false;
	}

	public void open() {
		System.out.println("The dog door open");
		open = true;

	}

	public void close() {
		System.out.println("The dog door closes");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

	public void setAllowedBark(String allowedBark) {
		this.allowedBark = allowedBark;
	}

	public String getAllowedBark() {
		return allowedBark;
	}

}
