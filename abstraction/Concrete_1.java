package com.java.symboisis.abstraction;

public class Concrete_1 extends Abstract_1 {

	@Override
	void show() {
		// TODO Auto-generated method stub
		
		System.out.println("\n Implemetion of abstract show");
		
	}

	@Override
	void Fun() {
		// TODO Auto-generated method stub
		
		System.out.println("\n Implemetion of abstract Fun");
		
	}
	
	public static void main(String[] args) {
		
		Concrete_1 c = new Concrete_1();
		
		c.show();
		c.Fun();
		c.demo();
	}
	
	

}
