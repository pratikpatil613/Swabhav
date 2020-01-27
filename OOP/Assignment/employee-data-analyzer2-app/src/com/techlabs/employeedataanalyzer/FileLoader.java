package com.techlabs.employeedataanalyzer;

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
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\kal\\Downloads\\Swabhav REpository\\"
					+ "OOP\\Assignment\\employee-data-analyzer2-app\\src\\"
					+ "com\\techlabs\\employeedataanalyzer\\dataFile.txt"));

			String line;
			String newLine = "";

			while ((line = br.readLine()) != null) {
				String[] employee = line.split("'");
				for (int i = 0; i < employee.length; i++) {
					newLine = newLine + employee[i];

				}
				String[] employeeData = newLine.split(",");

				int employeeId = Integer.parseInt(employeeData[0]);

				String employeeName = employeeData[1];
				String employeeDesignation = employeeData[2];
				String managerId = employeeData[3];
				String dateOfJoining = employeeData[4];
				double salary = Double.parseDouble(employeeData[5]);
				String commision = employeeData[6];
				int department = Integer.parseInt(employeeData[7]);

				Employee emp = new Employee(employeeId, employeeName, employeeDesignation, managerId, dateOfJoining,
						salary, commision, department);
				employees.add(emp);

				newLine = "";
			}
		} catch (Exception e) {
			// System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return employees;

	}

}
