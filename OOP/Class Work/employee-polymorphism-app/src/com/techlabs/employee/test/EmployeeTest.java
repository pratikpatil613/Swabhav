package com.techlabs.employee.test;

import com.techlabs.employee.Developer;
import com.techlabs.employee.Employee;
import com.techlabs.employee.Manager;

public class EmployeeTest {
	public static void main(String[] args) {
		Manager m1 = new Manager("1", "pratik", 10000);
		Developer d1 = new Developer("2", "Akash", 20000);

		printInfo(m1);
		printInfo(d1);

	}

	public static void printInfo(Employee e) {

		System.out.println("Employee number:" + e.getEno());
		System.out.println("Emoplyee name:" + e.getName());
		System.out.println("Employee balance:" + e.getBalane());
		System.out.println("Employee NetSalary:" + e.calculateNetSalary());
		System.out.println("Allowance:" + e.getAllowanceDetails());
		System.out.println();

	}

}
