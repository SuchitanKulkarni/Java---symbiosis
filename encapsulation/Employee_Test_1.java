package com.java.symboisis.encapsulation;

import java.util.Scanner;

public class Employee_Test_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee_1 e = new Employee_1();
		
		System.out.println("\nEnter the name : ");
		e.setEname(sc.next());
		
		System.out.println("\nEnter the designation : ");
		e.setDesignation(sc.next());
		
		System.out.println("\nEnter the id : ");
		e.setId(sc.nextInt());
		
		System.out.println("\nEnter the salary : ");
		e.setSalary(400000d);
		
		double increment = e.getSalary()*0.3;
		
		System.out.println("\n------------Year_1-------\n");
		
		System.out.println("Employee ID : " + e.getId());
		System.out.println("Employee Name : " + e.getEname());
		System.out.println("Employee Designation : " + e.getDesignation());
		System.out.println("Employee salary : " + e.getSalary()  );
		
		System.out.println("\n------------Year_2-------\n");
		
		System.out.println("Employee ID : " + e.getId());
		System.out.println("Employee Name : " + e.getEname());
		System.out.println("Employee Designation : " + e.getDesignation());
		e.setSalary(e.getSalary()*0.3 + e.getSalary());
		System.out.println("Employee salary : " + e.getSalary()  );
		
		System.out.println("\n------------Year_3-------\n");
		
		System.out.println("Employee ID : " + e.getId());
		System.out.println("Employee Name : " + e.getEname());
		System.out.println("Employee Designation : " + e.getDesignation());
		e.setSalary(e.getSalary()*0.3 + e.getSalary());
		System.out.println("Employee salary : " + e.getSalary()  );
		
		
	}

}
