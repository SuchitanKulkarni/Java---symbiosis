package com.java.symboisis.interfaces;

public class Class_1 implements Interface_1{

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
		System.out.println("\n It is the Fun in the interface");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println("\n It is the show in the interface");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("\n It is the display in the interface");
		
	}
	
	public static void main(String[] args) {
		
		Class_1 p = new Class_1();
		p.show();
		p.fun();
		p.display();
	}

}
