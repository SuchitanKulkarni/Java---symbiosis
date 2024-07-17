package com.java.symboisis.interfaces;

import java.util.Scanner;

public class Class_2 implements Interface_2{
	
	private int id;
	private double salary;
	private String nameString;
	private String deString;

	@Override
	public void details() {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("\nEnter the Employee name : ");
		nameString = sc.next();
		System.out.println("\nEnter the Employee id : ");
		id = sc.nextInt();
		System.out.println("\nEnter the Employee salary : ");
		salary = sc.nextDouble();
		System.out.println("\nEnter the Employee Designation : ");
		deString = sc.next();
		
		show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println("\n name : " + nameString + "\n Id : " + id + "\n Designation : " + deString + "\n salary : " + salary);
		
	}
	
	public static void main(String[] args) {
		
		Class_2 v = new Class_2();
		
		System.out.println("\n----"+Interface_2.companyString+"----------\n");
		
		v.details();
	}

}
