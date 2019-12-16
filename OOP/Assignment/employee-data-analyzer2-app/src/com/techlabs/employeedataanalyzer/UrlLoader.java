package com.techlabs.employeedataanalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class UrlLoader implements ILoader {

	@Override
	public List<Employee> load() {
		List<Employee> employees = new ArrayList<Employee>();

		try {

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

				Employee emp = new Employee(employeeId, employeeName, employeeDesignation, managerId, dateOfJoining,
						salary, commision, department);
				employees.add(emp);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return employees;

	}
}
