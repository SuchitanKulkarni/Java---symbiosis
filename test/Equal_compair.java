package com.java.symboisis.test;

public class Equal_compair {
	
	// "==" : 	 it is used to compair two values in java.
	// ".equals() : it is used to compair the two strings which is initialized; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Priti";
		String sname = "Priti";
		
		if(name == "Priti") {
			
			System.out.println("\nCompaired using '==' operetor ");
			
		}
		
		if(name.equals(sname)) {
			
			System.out.println("\n compaired using equals() function");
		}

	}

}
