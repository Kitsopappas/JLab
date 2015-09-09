package com.chris.lab.interfaceexample;

public interface Animal {
	public void eat();

	public void travel();

}
/*
 * An interface differs from an abstract class because an interface is not a
 * class. An interface is essentially a type that can be satisfied by any class
 * that implements the interface.
 * 
 * Any class that implements an interface must satisfy 2 conditions:
 * 
 * -It must have the phrase "implements Interface_Name" at the beginning of the
 * class definiton. 
 * -It must implement all of the method headings listed in the
 * interface definition.
 */