package com.java.symboisis.polymorphism;

public class Poly_child_1 extends Poly_parent_1 {
	
	public void money() {
		
		System.out.println("\nThis is child's money");
	}
	
	public void bike() {
		System.out.println("\nhello it is child bike");
	}
	
	public static void main(String[] args) {
		
		Poly_child_1 c = new Poly_child_1();
		
		c.money();
		
		Poly_parent_1 p = new Poly_child_1();
		
		p.money();
		
		p.bike();
		c.bike();
		
	}

}
