package com.techlabs.employeedataheirarchy.Generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.techlabs.datanalyzer.DataAnalyzer;
import com.techlabs.employeedataheirarchy.Employee;
import com.techlabs.employeedataheirarchy.IEmployee;

public class HeirarchyGenerator {
	private DataAnalyzer analyzer;
	private Employee employee;
	List<IEmployee> hierarchy = new ArrayList<IEmployee>();

	public HeirarchyGenerator(DataAnalyzer analyzer) {
		this.analyzer = analyzer;

	}

	public void arrangHeirarchay() {
		Employee emp = null;
		Employee ceo = null;
		Map<Employee, List<Employee>> ManagerEmpMap = analyzer.managerAndEmpName2();
		for (Entry<Employee, List<Employee>> entry : ManagerEmpMap.entrySet()) {
			if (entry.getKey().getManagerId().equalsIgnoreCase("null")) {
				ceo = entry.getKey();
				emp = ceo;

			}

		}
		for (Entry<Employee, List<Employee>> entry3 : ManagerEmpMap.entrySet()) {
			if (entry3.getKey() != ceo)

				ceo.add(entry3.getKey());
			if (entry3.getKey() != ceo)
				// while (entry3.getValue().size()!= null) {
				for (int i = 0; i < entry3.getValue().size(); i++) {
					entry3.getKey().add(entry3.getValue().get(i));
				}
		}

		emp.display();
	}

}
