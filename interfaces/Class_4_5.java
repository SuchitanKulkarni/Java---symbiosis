package com.java.symboisis.interfaces;

public class Class_4_5 implements Interface_4,Interface_5{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\n This is the display from the interface_5");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println("\n This is the show from the interface_4");
		
	}
	
	public static void main(String[] args) {
		
		Class_4_5 c = new Class_4_5();
		
		c.display();
		c.show();
		
	}

}
