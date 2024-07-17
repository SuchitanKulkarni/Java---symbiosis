package com.java.symboisis.test;

import java.util.Scanner;

public class Test_Employee_details {
	
	public static void main(String[] args) {
		
		Manager m = new Manager();
		Developer d = new Developer();
		Programmer p = new Programmer();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\n--------Manager---------\n");
		
		System.out.println("\n Enter the name : ");
		m.setNameString(sc.next());
		
		System.out.println("\n Enter the Designation : ");
		m.setDesgiString(sc.next());
		
		System.out.println("\n Enter the address : ");
		m.setAddString(sc.next());
		
		System.out.println("\n Enter the salary : ");
		m.setSalary(sc.nextDouble());
		
		System.out.println("\n Enter the Number of projects : ");
		m.setProjects(sc.nextInt());
		
		System.out.println("\n Enter the percentage of Project involvement : ");
		m.setPercentage(sc.nextFloat());
		
		int c = m.getProjects();
		
		m.managingprojects(c);
		m.performanacereport(c);
		m.bonuses(c);
		
		
		
		System.out.println("\n--------Developer---------\n");

		System.out.println("\n Enter the name : ");
		d.setNameString(sc.next());
		
		System.out.println("\n Enter the Designation : ");
		d.setDesgiString(sc.next());
		
		System.out.println("\n Enter the address : ");
		d.setAddString(sc.next());
		
		System.out.println("\n Enter the salary : ");
		d.setSalary(sc.nextDouble());
		
		System.out.println("\n Enter the Number of projects : ");
		d.setProjects(sc.nextInt());
		
		System.out.println("\n Enter the percentage of Project involvement : ");
		d.setPercentage(sc.nextFloat());
		
		int b = d.getProjects();
		
		d.managingprojects(b);
		d.performanacereport(b);
		d.bonuses(b);
		
		
		System.out.println("\n--------Programmer---------\n");

		System.out.println("\n Enter the name : ");
		p.setNameString(sc.next());
		
		System.out.println("\n Enter the Designation : ");
		p.setDesgiString(sc.next());
		
		System.out.println("\n Enter the address : ");
		p.setAddString(sc.next());
		
		System.out.println("\n Enter the salary : ");
		p.setSalary(sc.nextDouble());
		
		System.out.println("\n Enter the Number of projects : ");
		p.setProjects(sc.nextInt());
		
		System.out.println("\n Enter the percentage of Project involvement : ");
		p.setPercentage(sc.nextFloat());
		
        int a = p.getProjects();
		
		p.managingprojects(a);
		p.performanacereport(a);
		p.bonuses(a);
		
		
 }

}
