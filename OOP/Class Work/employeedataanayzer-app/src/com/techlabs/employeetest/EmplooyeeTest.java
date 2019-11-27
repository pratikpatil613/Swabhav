ccpackage com.techlabs.employeetest;

import java.util.*;
import java.util.stream.Collectors;

import javax.swing.text.Document;

import com.techlabs.abstractclass.Employee;

import java.io.*;
import java.net.URI;
import java.net.URL;

public class EmplooyeeTest {
	public static void main(String[] args) {
		Set<Employee> employees = new TreeSet<Employee>();

		try {

			BufferedReader br = new BufferedReader(new FileReader(
					"C:\\Users\\kal\\Downloads\\Swabhav REpository\\OOP\\Class Work\\employeedataanayzer-app\\src\\com\\techlabs\\abstractclass\\dataFile.txt"));

			// URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
			// BufferedReader br = new BufferedReader(new
			// InputStreamReader(url.openStream()));

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

		} catch (IOException e) {
			e.printStackTrace();
		}

		findMaxSal(employees, 10);
		findMaxSal(employees, 20);
		findMaxSal(employees, 30);

	}

	public static void findMaxSal(Set<Employee> employees, int department) {
		System.out.println("In department:" + department);
		int count = 0;
		Employee maxSalEmployee = null;
		for (Employee e : employees) {
			if (e.getDepartment() == department) {
				count++;
				if (maxSalEmployee == null || e.getSalary() > maxSalEmployee.getSalary()) {
					maxSalEmployee = e;
				}
			}
		}
		System.out.println("Total no of emplyee:" + count);

		printInfo(maxSalEmployee);
	}

	public static void printInfo(Employee e) {
		System.out.println("Highest sal employee is:" + "\nId:" + e.getEmployeeId() + "\nName:" + e.getEmployeeName()
				+ "\nDesignation:" + e.getEmployeeDesignation() + "\nManager Id:" + e.getEmployeeId()
				+ "\nDate OF joining" + e.getDateOFJoining() + "\nSalary:" + e.getSalary() + "\nCommision:"
				+ e.getCommision() + "\nDeaprtMent:" + e.getDepartment() + "\n");

	}

}
