package com.techlabs.isp2.solution;

public class Robot implements IWorkable {

	@Override
	public void startWork() {
		System.out.println("Robot start working");

	}

	@Override
	public void stopWork() {
		System.out.println("Robot Stop Working");

	}

}
