package com.techlabs.ispviolation;

public class Developer implements IWork {

	@Override
	public void startWork() {
		System.out.println("Developer start Working");

	}

	@Override
	public void stopWork() {
		System.out.println("Developer Stop Working");

	}

	@Override
	public void startEat() {

	}

	@Override
	public void stopEat() {

	}

}
