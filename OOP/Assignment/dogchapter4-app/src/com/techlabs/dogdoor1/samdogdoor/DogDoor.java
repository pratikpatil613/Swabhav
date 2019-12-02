package com.techlabs.dogdoor1.samdogdoor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;
	private List allowedBark;

	public DogDoor() {
		this.open = false;
		this.allowedBark = new LinkedList();

	}

	public void open() {
		System.out.println("The dog door open");
		open = true;

		Timer timer = new Timer();
		{
			timer.schedule(new TimerTask() {
				public void run() {
					close();
					timer.cancel();
				}
			}, 2000);
		}

	}

	public void close() {
		System.out.println("The dog door closes");
		open = false;
	}

	public boolean isOpen() {
		return open;

	}

	public void addAllowedBark(Bark allowedBark) {
		this.allowedBark.add(allowedBark);
	}

	public List getAllowedBark() {
		return allowedBark;
	}

}
