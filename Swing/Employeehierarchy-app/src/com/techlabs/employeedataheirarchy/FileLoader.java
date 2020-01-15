package com.techlabs.employeedataheirarchy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileLoader implements ILoader {

	@Override
	public List<Employee> load() {
		List<Employee> employees = new ArrayList<Employee>();

		try {
			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\kal\\Downloads\\Swabhav REpository\\Swing\\"
							+ "Employeehierarchy-app\\src\\com\\techlabs\\employeedataheirarchy\\EmployeeData.txt"));

			String line;

			while ((line = br.readLine()) != null) {

				String[] employeeData = line.split(",");

				int empNo = Integer.parseInt(employeeData[0]);
				String empName = employeeData[1];
				String empJob = employeeData[2];
				String managerId = employeeData[3];
				String hireDate = employeeData[4];
				double salary = Double.parseDouble(employeeData[5]);
				String commision = employeeData[6];
				int deptNO = Integer.parseInt(employeeData[7]);

				Employee emp = new Employee(empNo, empName, empJob, managerId, hireDate, salary, commision, deptNO);
				employees.add(emp);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// for (Employee e : employees) {
		// System.out.println(e);
		// }

		return employees;

	}

}
