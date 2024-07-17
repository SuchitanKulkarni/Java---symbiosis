package com.java.symboisis.test;

public class Inheritance1 extends Inheritance {
	
	public void display() {
		
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		
		System.out.println("\n-------Single-level--------");
		
		Inheritance1 a = new Inheritance1();
		
		a.show();
		a.display();
	}

}
