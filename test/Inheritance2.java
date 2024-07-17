package com.java.symboisis.test;

public class Inheritance2 extends Inheritance1 {
	
	public void assume() {
		
		System.out.println("\nGrandchild");
	}
	
	public static void main(String[] args) {
		
		System.out.println("\n---------Multi-level---------");
		
		Inheritance2 b = new Inheritance2();
		b.show();
		b.display();
		b.assume();
	}
}
