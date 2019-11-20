package com.techlabs.customannotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Reflection {
	public static void main(String[] args) {
		Class cls = Foo.class;
		System.out.println(cls.getClass());

		Method[] methods = cls.getDeclaredMethods();
		int methodsCount = 0;
		for (Method m : methods) {
			methodsCount++;
		}
		System.out.println("no of methods:" + methodsCount);

		// Method[] annotationsMethods = cls.getDeclaredMethods();
		int annotationsCount = 0;

		for (Method m : cls.getDeclaredMethods()) {
			if (m.isAnnotationPresent(NeedRefactory.class))
				annotationsCount++;
		}
		System.out.println("no of annoted methods:" + annotationsCount);

	}

}
