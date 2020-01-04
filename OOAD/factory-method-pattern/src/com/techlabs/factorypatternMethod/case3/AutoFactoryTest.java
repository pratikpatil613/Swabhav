package com.techlabs.factorypatternMethod.case3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.techlabs.factorymethodpattern.case3.Audi;
import com.techlabs.factorymethodpattern.case3.BMW;
import com.techlabs.factorymethodpattern.case3.IAutomobile;
import com.techlabs.factorymethodpattern.case3.IAutomobileFactory;
import com.techlabs.factorymethodpattern.case3.Tesla;

import sun.reflect.generics.scope.MethodScope;

public class AutoFactoryTest {
	public static void main(String[] args) {
		try {
			IAutomobileFactory factory = codeFromPropertyFile();
			IAutomobile auto = factory.make();
			auto.start();
			auto.stop();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// factory = Audi.getInstance();
		// auto = factory.make();
		// auto.start();
		// auto.stop();

	}

	public static IAutomobileFactory codeFromPropertyFile() {
		try {
			Properties prop = new Properties();
			File fileName = new File("C:\\Users\\kal\\Downloads\\Swabhav REpository\\"
					+ "OOAD\\factory-method-pattern\\src\\com\\techlabs\\"
					+ "factorypatternMethod\\case3\\CarFactory.properties");

			InputStream in = new FileInputStream(fileName);
			prop.load(in);

			String cls = prop.getProperty("factory");
			// System.out.println(cls);

			Class className = Class.forName(cls);
			// Class className = Tesla.class;

			Class noparams[] = {};

			Method method = className.getDeclaredMethod("getInstance", noparams);
			IAutomobileFactory autofaFactory = (IAutomobileFactory) method.invoke(className.newInstance());
			return autofaFactory;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
