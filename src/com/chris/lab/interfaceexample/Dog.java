package com.chris.lab.interfaceexample;

public class Dog implements Animal {

	public void eat() {
		System.out.println("Dog eats");
	}

	public void travel() {
		System.out.println("Dog travels");
	}

	public int noOfLegs() {
		return 0;
	}

	
}
