package com.java.symboisis.string;

public class String_1 {
	
	public static void main(String[] args) {
		
		String s1 = "hello";
		
		String s2 = new String("java");
		
		String s3 = "hello";	
		
	/*	this will not going to create the 
		object it just simply point to the s1 as it contain same data */
		
		String s4 = new String("java");
		
		/* it will create the object even if it contains same data*/
		
		System.out.println("data : " + s1 + " "+ s2+ " "+s3 + " "+ s4);
		
	}

}
