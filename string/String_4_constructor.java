package com.java.symboisis.string;

public class String_4_constructor {
	
	public static void main(String[] args) {
		
		String s1 = new String();	// creating empty array of charater
		String s2 = new String("hello"); // initilizing value
		
		char [] c = {'j','a','v','a'}; 		// passing charater array as a value
		
		String s3 = new String(c);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
