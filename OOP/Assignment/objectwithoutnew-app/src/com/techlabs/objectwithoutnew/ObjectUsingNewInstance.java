package com.techlabs.objectwithoutnew;

import java.lang.reflect.Constructor;

import com.techlabs.simpleclass.SimpleClass;

public class ObjectUsingNewInstance {

	public static void main(String[] args) throws Exception {

		Constructor<SimpleClass> con = SimpleClass.class.getConstructor();
		SimpleClass s3 = con.newInstance();
		s3.setName("parth");
		s3.setAge(20);

		printInfo(s3);

	}

	private static void printInfo(SimpleClass s) {
		System.out.println("Name:" + s.getName());
		System.out.println("Age:" + s.getAge());

	}

}
