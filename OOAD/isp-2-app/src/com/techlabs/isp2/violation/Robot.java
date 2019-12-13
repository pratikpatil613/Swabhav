package com.techlabs.isp2.violation;

public class Robot implements IWork {

	@Override
	public void startWork() {
		System.out.println("Robot start working");

	}

	@Override
	public void stopWork() {
		System.out.println("Robot stop working");

	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robot dont want to eat");

	}

	@Override
	public void stopEat() {
		throw new RuntimeException("Robot dont want to eat");

	}

}
