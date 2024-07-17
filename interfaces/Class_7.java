package com.java.symboisis.interfaces;

public class Class_7 extends Class_6 implements Interface_1,Interface_7{
	
	public void show() {
		System.out.println("\n Thanks for Visiting");
	}
	
	public static void main(String[] args) {
		Class_7 c = new Class_7();
		
		System.out.println("\n--------class6----------\n");
		c.CustomerDetails();
		System.out.println("\n--------interface_6----------\n");
		c.vehicle();
		System.out.println("\n--------interface_7----------\n");
		c.Electronics();
		System.out.println("\n--------interface_8----------\n");
		c.clothes();
		System.out.println("\n--------class7----------\n");
		c.show();
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
		
		System.out.println("\nhello");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\nHi");
		
	}

}
