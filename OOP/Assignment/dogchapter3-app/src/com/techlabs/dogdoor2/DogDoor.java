package com.techlabs.dogdoor2;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;

	public DogDoor() {
		this.open = false;
	}

	public void open() {
		System.out.println("The dog door open");
		open = true;

		Timer timer = new Timer();
		{
			timer.schedule(new TimerTask() {
				public void run() {
					close();
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

}
