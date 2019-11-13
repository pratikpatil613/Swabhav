package com.techlabs.dotproperties;

import java.util.Properties;
import java.io.*;

public class DotProperties {
	public static void main(String[] args) throws IOException {

		File fileName = new File("data.properties");

		Properties read = new Properties();

		OutputStream out = new FileOutputStream(fileName);
		read.setProperty("Name", "SwabhavTechlabs");
		read.setProperty("Address", "Andheri East");
		read.setProperty("Location", "Mumbai");

		FileInputStream ps = new FileInputStream(fileName);
		read.load(ps);

		System.out.println(read.getProperty("Name"));
		System.out.println(read.getProperty("Address"));
		System.out.println(read.getProperty("Location"));

		read.list(System.out);

	}

}