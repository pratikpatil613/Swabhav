package com.techlabs.factorymethodpattern.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.techlabs.factroymethodpattern.AutoType;
import com.techlabs.factroymethodpattern.AutomobileFactory;
import com.techlabs.factroymethodpattern.IAutomobile;

public class AutoFactoryTest {
	public static void main(String[] args) throws IOException {

		AutomobileFactory autoFactory = AutomobileFactory.getInstance();

		IAutomobile auto = autoFactory.make(AutoType.Audi);
		System.out.println(auto.getClass());
		auto.start();
		auto.stop();

		auto = autoFactory.make(AutoType.BMW);
		System.out.println(auto.getClass());
		auto.start();
		auto.stop();

		codeFromPropertyFile();
	}

	public static void codeFromPropertyFile() throws IOException {
		Properties prop = new Properties();
		File fileName = new File("CarFactory.properties");

		// OutputStream out = new FileOutputStream(fileName);
		InputStream in = new FileInputStream(fileName);
		prop.load(in);

		System.out.println(prop.getProperty("factory"));

	}

}
