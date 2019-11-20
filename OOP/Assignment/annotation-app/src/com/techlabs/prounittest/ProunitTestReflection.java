package com.techlabs.prounittest;

import java.lang.annotation.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class ProunitTestReflection {
	public static void main(String[] args) {
		Class className = Foo.class;

		int methodCount = 0, annotedMethodCount = 0, passedCount = 0, failedCount = 0;

		for (Method methods : className.getDeclaredMethods()) {

			methodCount++;
		}
		System.out.println("Total Number Of Methods:" + methodCount);

		for (Method passFailmethods : className.getDeclaredMethods()) {
			if (passFailmethods.isAnnotationPresent(ProunitTest.class)) {
				annotedMethodCount++;

				{
					try {
						boolean methodReturn = (boolean)
								passFailmethods.invoke(className.newInstance());
						if (methodReturn == true)
							passedCount++;

						if (methodReturn == false)
							failedCount++;

					} catch (Exception e) {

						System.out.println(e.getMessage());
					}

				}

			}
		}
		System.out.println("Number of Annoted Methods:" + annotedMethodCount
				+ "\nNumber of Passed Methods:"
				+ passedCount + "\nNumber of failed Methods:" + failedCount);

	}

}
