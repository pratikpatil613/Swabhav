package com.techlabs.employeedataheirarchy.test;

import java.awt.print.Printable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.techlabs.datanalyzer.DataAnalyzer;
import com.techlabs.employeedataheirarchy.Employee;
import com.techlabs.employeedataheirarchy.FileLoader;
import com.techlabs.employeedataheirarchy.Parser;
import com.techlabs.employeedataheirarchy.Generator.HeirarchyGenerator;

public class EmployeeHierarchyTest {
	public static void main(String[] args) {
		FileLoader loader = new FileLoader();
		// loader.load();
		Parser parser = new Parser(loader);
		//parser.Parse();

		DataAnalyzer analyzer = new DataAnalyzer(parser);
		//analyzer.managerNOAndManagerName();
	//	analyzer.managerAndEmpName();
		//analyzer.ManagerIdAndReporteesName();
	//	analyzer.managerAndEmpName2();
		HeirarchyGenerator hieGenerator=new HeirarchyGenerator(analyzer);
	//	hieGenerator.arrangHeirarchay();
	//	print(analyzer.managerAndEmpName2());
		print(analyzer.managerAndEmpName());
		hieGenerator.arrangHeirarchay();
		
	//	hieGenerator.display();
	}

	private static<K,V> void print(Map<K, List<V>> managerAndEmpName) {
		for (Entry<K, List<V>> entry :managerAndEmpName.entrySet())

			System.out.println("Key = " + entry.getKey() + "\n Value = " + entry.getValue());

		
	}
	
	

}
