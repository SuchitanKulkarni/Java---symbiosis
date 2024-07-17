package com.java.symboisis.collection.list;

public class Auto_boxing {
	
	public static void main(String[] args) {
		
		int a = 10;		//primitive datatype
		
		Integer b = new Integer(a);  // Non primitive datatype(converting)
		
		System.out.println(a+" "+b);
		
		
		double c = 30;
		
		Double d = new Double(30);
		
		System.out.println(c+" "+ d);  		//here the convertion is not done.
		
		
		float f = 3f;
		
		Float float1 = new Float(f);
		
		System.out.println(float1);
		
		char p = 'A';
		
		Character c1 = new Character(p);
		
		System.out.println(c1);
		
		
	}

}
