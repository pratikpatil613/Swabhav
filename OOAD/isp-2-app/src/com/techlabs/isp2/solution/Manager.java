package com.techlabs.isp2.solution;

public class Manager implements IWorkableEatable {

	@Override
	public void startWork() {
		System.out.println("Manager start working");

	}

	@Override
	public void stopWork() {
		System.out.println("Manager stop working");

	}

	@Override
	public void startEat() {
		System.out.println("Manager start Eat");

	}

	@Override
	public void stopEat() {

		System.out.println("Manager stop eat");

	}

}
