package com.java.symboisis.interfaces;

import java.util.Scanner;

public class Class_6 implements Interface_8 {
	
	public void CustomerDetails() {
		
		String nameString;
		String passString;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Enter the name : ");
		nameString =  sc.next();
		System.out.println("\n Enter the Password : ");
		passString =  sc.next();
		
	}

	@Override
	public void vehicle() {
		// TODO Auto-generated method stub
		
		System.out.println("\n1.car\n2.Bike\n3.Truck");
		
	}

	@Override
	public void Electronics() {
		// TODO Auto-generated method stub
		System.out.println("\n1.Phone\n2.Laptop\n3.Washing machine");
		
	}

	@Override
	public void clothes() {
		// TODO Auto-generated method stub
		System.out.println("\n1.Kurti\n2.Saree\n3.westen");
		
	}

}
