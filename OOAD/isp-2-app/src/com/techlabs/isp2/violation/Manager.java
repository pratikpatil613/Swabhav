package com.techlabs.isp2.violation;

public class Manager implements IWork {

	@Override
	public void startWork() {
		System.out.println("Manager start Working");

	}

	@Override
	public void stopWork() {
		System.out.println("Manager stop Working");

	}

	@Override
	public void startEat() {
		System.out.println("Manager start eating");

	}

	@Override
	public void stopEat() {
		System.out.println("Manager Stop eating");

	}

}
