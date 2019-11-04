package com.techlabs.reflection.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.techlabs.reflection.Account;

public class ReflectionAccountTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class cls = Account.class;
		System.out.println(cls.getName());

		Constructor[] con = cls.getConstructors();
		int noOfCon = 0;
		for (int i = 0; i < con.length; i++) {
			System.out.println(con[i].getName());
			noOfCon++;
		}
		System.out.println("no of constructor:" + noOfCon);

		Method[] methods = cls.getDeclaredMethods();
		int noOfMethods = 0;
		for (int m = 0; m < methods.length; m++) {
	//		 System.out.println(methods[m].getName());
			noOfMethods++;
		}
		System.out.println("no of methods:" + noOfMethods);

		Method[] setters = cls.getMethods();
		int NoOfSetters = 0;
		for (int s = 0; s < setters.length; s++) {
			String settersName = setters[s].getName();
			if (settersName.startsWith("set")) {

				NoOfSetters++;
			}
		}
		System.out.println("no of setters:" + NoOfSetters);

		Method[] getters = cls.getDeclaredMethods();
		int NoOfGetters = 0;
		for (int g = 0; g < getters.length; g++) {
			String gettersName = getters[g].getName();
			if (gettersName.startsWith("get")) {
				NoOfGetters++;
			}
		}
		System.out.println("no of getters:" + NoOfGetters);

	}
}
