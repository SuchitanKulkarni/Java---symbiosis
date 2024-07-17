package com.java.symboisis.test;

public class Main_overloading {
	
	/* so we can overload the main method as well because for overloading we have to change the parameter or arguments of the
	   main methode and due to which the JVM will only execute the original main methode without getting confused
	   Here the original main method only get called automatically withpout using object by JVM but to execute the overloaded
	   method needs object to execute.	
	*/
	
	public static void main(int a) {
		
		System.out.println(" \nHello this is the overloaded method contains integer as parameter");
	}
	
	public static void main(char a) {
		
		System.out.println(" \nHello this is the overloaded method contains charater as parameter");
	}
	
	public static void main(int a, float b) {
		
		System.out.println(" \nHello this is the overloaded method contains integer,float as parameter");
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		main(0);
		main(0);
		main(0, 0);
	}

}
