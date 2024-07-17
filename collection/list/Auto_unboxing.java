package com.java.symboisis.collection.list;

public class Auto_unboxing {
	
	public static void main(String[] args) {
		
		Character character = new Character('t');
		
		char p = character;
		
		System.out.println(p); 		//auto unboxing converting non primitive to primitive.
		
		Integer a = new Integer(35);
		
		int b = a;
		
		System.out.println(b);
		
		
		Double d = new Double(23);
		
		double d1 = d;
		
		System.out.println(d1);
		
		Float float1 = new Float(3.5);
		
		float f1 = float1;
		
		System.out.println(f1);
	}

}
