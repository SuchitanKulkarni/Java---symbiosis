package com.java.symboisis.collection.list;

import java.util.LinkedList;
import java.util.Scanner;

public class Details_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		String nameString;
		int age;
		double salary;

		System.out.println("\n Enter the number of employee");
		n = sc.nextInt();
		
		LinkedList<Employee> l2 = new LinkedList<>();
		
		for(int i=0;i<n;i++) {
			
			System.out.println("\n ENter the name of Employee : ");
			nameString= sc.next();
			
			System.out.println("\n Enter the age of employee : ");
			age = sc.nextInt();
			
			System.out.println("\n Enter the salary : ");
			salary = sc.nextDouble();
			
			Employee e = new Employee(nameString, age, salary);
			
			l2.add(e);
		}
		
		for(Employee y:l2) {
			
			System.out.println(y.name);
			System.out.println(y.age);
			System.out.println(y.salary);
		}
	}

}
