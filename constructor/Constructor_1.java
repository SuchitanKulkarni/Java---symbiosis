package com.java.symboisis.constructor;

public class Constructor_1 {
	
	String a;
	int b;
	float c;
	
	public Constructor_1(){
		
		b = 89;
		a = "Hello";
		
	}
	
	public Constructor_1(int p) {
		
		b = p;
		
	}
	
	
	public static void main(String[] args) {
		
		Constructor_1 p = new Constructor_1() ;
		Constructor_1 q = new Constructor_1(10) ;
		System.out.println("\n "+p.a);
		System.out.println("\n "+p.b);
		System.out.println("\n "+p.c);
		
		System.out.println("\n " + q.b);
	}

}
