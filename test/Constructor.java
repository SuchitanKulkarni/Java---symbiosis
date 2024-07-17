package com.java.symboisis.test;

public class Constructor {
	
	/* the main difference between constructor and method is constructor does not have return type and get automatically called 
	 * after the object creation.
	 * constructor is basically used to construct the things in creating object like if we want the value of a = 10 at the 
	 * time of creating the object then we can include it in constructor.
	 */
	
	public Constructor(){
		
		System.out.println("\n Hello Constructor is called at the time of creating the object ");
	}
	
	public void show() {
		
		System.out.println("\n Hello Method is called using object");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor c = new Constructor();
		
		c.show();

	}

}
