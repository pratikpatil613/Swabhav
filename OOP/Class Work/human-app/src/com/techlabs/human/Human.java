package com.techlabs.human;

public class Human {

	private String name;
	private int age;
	private float height;
	private float weight;
	private GenderType gender;
	private final float UNDERWEIGHT = 18.5f, NEWUNDERWEIGHT = 24.9f, OVERWEIGHT = 25f, NEWOVERWEIGHT = 29.9f;

	public Human(String name, int age, float height, float weight, GenderType gender) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}

	public Human(String name, int age) {
		this(name, age, 5f, 50f, GenderType.Male);

	}

	public void eat() {
		// this.weight=weight;
		float newWeight = (2f / 100f * weight) + weight;
		System.out.println("weight after eat=" + newWeight);

	}

	public void workout() {
		float newWeight = weight - (0.5f / 100f * weight);
		System.out.println("weight after workout=" + newWeight);

		float newHeight = height + (0.25f / 100f * height);
		System.out.println("height after workout=" + newHeight);

	}

	public float calculateBMI() {
		float newheight = height / 100f;
		float BMI = weight / (newheight * newheight);
		return BMI;
	}

	public String calculateBMICategory() {
		float newheight = height / 100f;
		float newBMI = weight / (newheight * newheight);

		if (newBMI < UNDERWEIGHT) {
			return "Underwight";
		} else if (newBMI > UNDERWEIGHT && newBMI < NEWUNDERWEIGHT) {
			return "Normal weight";
		} else if (newBMI > OVERWEIGHT && calculateBMI() < NEWOVERWEIGHT) {
			return "Overweight";
		} else
			return "Obesity";
	}

}
