package com.techlabs.abstractclass;

import java.util.*;
import java.util.stream.Collectors;

import javax.swing.text.Document;

import java.io.*;
import java.net.URI;
import java.net.URL;

public class EmplooyeeTest {
	public static void main(String[] args) {
		Set<Employee> employee = new TreeSet<Employee>();

		Employee emp;
		try {

			// BufferedReader br = new BufferedReader(
			// new FileReader("C:\\Users\\kal\\Downloads\\Swabhav REpository\\OOP\\Class
			// Work\\"
			// +
			// "employeedataanayzer-app\\src\\com\\techlabs\\abstractclass\\dataFile.txt"));

			URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

			String line;

			while ((line = br.readLine()) != null) {
				String[] employeeData = line.split(",");

				int employeeId = Integer.parseInt(employeeData[0]);
				String employeeName = employeeData[1];
				String employeeDesignation = employeeData[2];
				String managerId = employeeData[3];
				String dateOfJoining = employeeData[4];
				double salary = Double.parseDouble(employeeData[5]);
				String commision = employeeData[6];
				int department = Integer.parseInt(employeeData[7]);

				// System.out.println(employeeName + employeeDesignation + managerId +
				// dateOfJoining + salary + commision
				// + department);

				emp = new Employee(employeeId, employeeName, employeeDesignation, managerId, dateOfJoining, salary,
						commision, department);
				employee.add(emp);

			}

			/*
			 * for (Employee e : employee) { System.out.println(e); }
			 */
			// printToatalEmp(employee);

			Map<String, List<Employee>> employeeMap = employee.stream()
					.collect(Collectors.groupingBy(Employee::getEmployeeDesignation));
			// System.out.println("Employees grouped by department");
			// employeeMap.forEach((String key, List<Employee> empList) ->
			// System.out.println(key + " -> " + empList));

		} catch (IOException e) {
			e.printStackTrace();
		}

		Employee e = findMaxSal(employee);
		System.out.println("Highest sal employee is:" + "\nId:" + e.getEmployeeId() + "\nName:" + e.getEmployeeName()
				+ "\nDesignation:" + e.getEmployeeDesignation() + "\nManager Id:" + e.getEmployeeId()
				+ "\nDate OF joining" + e.getDateOFJoining() + "\nSalary:" + e.getSalary() + "\nCommision:"
				+ e.getCommision() + "\nDeaprtMent:" + e.getDepartment() + "\n");

		Employee e1 = findMaxSal1(employee);
		System.out.println("Highest sal employee is:" + "\nId:" + e1.getEmployeeId() + "\nName:" + e1.getEmployeeName()
				+ "\nDesignation:" + e1.getEmployeeDesignation() + "\nManager Id:" + e1.getEmployeeId()
				+ "\nDate OF joining" + e1.getDateOFJoining() + "\nSalary:" + e1.getSalary() + "\nCommision:"
				+ e1.getCommision() + "\nDeaprtMent:" + e1.getDepartment() + "\n");

		Employee e2 = findMaxSal2(employee);
		System.out.println("Highest sal employee is:" + "\nId:" + e2.getEmployeeId() + "\nName:" + e2.getEmployeeName()
				+ "\nDesignation:" + e2.getEmployeeDesignation() + "\nManager Id:" + e2.getEmployeeId()
				+ "\nDate OF joining" + e2.getDateOFJoining() + "\nSalary:" + e2.getSalary() + "\nCommision:"
				+ e2.getCommision() + "\nDeaprtMent:" + e2.getDepartment());

	}

	public static Employee findMaxSal(Set<Employee> employees) {
		System.out.println("In department 10");
		int count = 0;
		Employee maxSal = null;
		for (Employee e : employees) {
			if (e.getDepartment() == 10)
				count++;
			if (maxSal == null || e.getSalary() > maxSal.getSalary()) {
				maxSal = e;
			}
		}
		System.out.println("Total no of emplyee:" + count);

		return maxSal;

	}

	public static Employee findMaxSal1(Set<Employee> employees) {
		System.out.println("In deptment 20");
		int count = 0;
		Employee maxSal = null;

		for (Employee e : employees) {
			if (e.getDepartment() == 20)
				count++;

			if (maxSal == null || e.getSalary() > maxSal.getSalary() && e.getDepartment() == 20) {
				maxSal = e;
			}
		}
		System.out.println("Total no of emplyee:" + count);

		return maxSal;

	}

	public static Employee findMaxSal2(Set<Employee> employees) {
		System.out.println("In deptment 30");
		int count = 0;
		Employee maxSal = null;
		for (Employee e : employees) {
			if (e.getDepartment() == 30)
				count++;

			if (maxSal == null || e.getSalary() > maxSal.getSalary() && e.getDepartment() == 30) {
				maxSal = e;
			}
		}
		System.out.println("Total no of emplyee:" + count);
		return maxSal;

	}

}
