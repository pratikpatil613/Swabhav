package com.techlabs.dipsolution;

public class Manager implements IEmployee {
	IEmployee employee;

	public Manager(IEmployee employee) {
		this.employee = employee;
	}

	@Override
	public void work() {
		System.out.println("Manager start enspecting->"+employee
				.getClass().getSimpleName()+":");
		employee.work();

	}
	
	

}
