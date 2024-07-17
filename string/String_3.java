package com.java.symboisis.string;

public class String_3 {
	
	public static void main(String[] args) {
		
		String s = new String("Neha");
		String p = new String("Neha");
		
		String_3 c1  = new String_3();
		String_3 c2 =  new String_3();
		
		System.out.println(s);		// here the tostring method is executed implicitly
		System.out.println(s.toString()); // here the tostring method is executed explicitly
		
		System.out.println(s.equals(p)); // here the actual conatin of the string is compired not hashcode of it.
		System.out.println(c1.equals(c2)); // here hashcode is compaired.
		
	}

}
