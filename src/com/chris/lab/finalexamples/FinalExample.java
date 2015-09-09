package com.chris.lab.finalexamples;

/*
 Final
 Once you make a reference final you are not allowed 
 to change that reference and compiler will verify this 
 and raise compilation error if you try to re-initialized 
 final variables in java.
 */
public class FinalExample {
	private final String j = "java rocks";

	public FinalExample() {
		// invalid compilation error
		 j = new String("loan");

	}

	public final String getName() {
		return "personal loan";
	}

	
}
