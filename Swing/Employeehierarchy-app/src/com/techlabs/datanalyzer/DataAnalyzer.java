package com.techlabs.datanalyzer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.techlabs.employeedataheirarchy.Employee;
import com.techlabs.employeedataheirarchy.Parser;

public class DataAnalyzer {
	private Parser parser;
	Map<String, String> empManagerMap = new TreeMap<String, String>();

	public DataAnalyzer(Parser parser) {
		this.parser = parser;
	}

	public void managerNOAndManagerName() {
		Set<Employee> empset = parser.Parse();
		for (Employee e : empset) {
			for (Employee d : empset) {
				String empNO = Integer.toString(d.getEmpNo());
				if (e.getManagerId().equals(empNO)) {
					empManagerMap.put(e.getManagerId(), d.getEmpName());
				}
			}
		}
		for (Map.Entry<String, String> entry : empManagerMap.entrySet())

			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}

	public Map<String, List<String>> managerAndEmpName() {
		Set<Employee> empset2 = parser.Parse();
		List<String> reportingEmployees;
		Map<String, List<String>> empManagerNameMap = new TreeMap<String, List<String>>();
		// Map<String, String> empManagerNameMap = new TreeMap<String, String>();
		for (Employee e : empset2) {
			reportingEmployees = new ArrayList<String>();
			for (Employee m : empset2) {
				String empNO = Integer.toString(e.getEmpNo());

				if (m.getManagerId().equals(empNO)) {
					reportingEmployees.add(m.getEmpName());

				
				if (empManagerNameMap.containsKey(e.getEmpName())) {
					empManagerNameMap.put(e.getEmpName(), reportingEmployees);
				} else
					empManagerNameMap.put(e.getEmpName(), reportingEmployees);
			}
		}
	}
		System.out.println(" ");
//		for (Entry<String, List<String>> entry : empManagerNameMap.entrySet())

//			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		return empManagerNameMap;
	}

	public void ManagerIdAndReporteesName() {
		Set<Employee> set3 = parser.Parse();
		Map<String, String> empandMId = new TreeMap<String, String>();
		for (Employee e : set3) {
			empandMId.put(e.getEmpName(), e.getManagerId());
		}
		System.out.println(" ");
		for (Entry<String, String> entry : empandMId.entrySet())

			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

	}

	public Map<Employee, List<Employee>> managerAndEmpName2() {
		Set<Employee> empset2 = parser.Parse();
		List<Employee> reportingEmployees;
		Map<Employee, List<Employee>> empManagerNameMap = new TreeMap<Employee, List<Employee>>();
		// Map<String, String> empManagerNameMap = new TreeMap<String, String>();
		for (Employee e : empset2) {
			reportingEmployees = new ArrayList<Employee>();
			for (Employee m : empset2) {
				String empNO = Integer.toString(e.getEmpNo());

				if (m.getManagerId().equals(empNO)) {
					reportingEmployees.add(m);

					if (empManagerNameMap.containsKey(e)) {
						empManagerNameMap.put(e, reportingEmployees);
					} else
						empManagerNameMap.put(e, reportingEmployees);
				}
			}

		}

		// System.out.println(" ");
		// for (Entry<Employee, List<Employee>> entry : empManagerNameMap.entrySet())

		// System.out.println("Key = " + entry.getKey() + ", Value = " +
		// entry.getValue());
		return empManagerNameMap;
	}

}
