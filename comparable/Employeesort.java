package com.java.symboisis.comparable;

import java.util.TreeSet;

public class Employeesort {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Anv",890000.857);
		Employee e2 = new Employee(104,"Kaveri",67000.759);
		Employee e3 = new Employee(102,"swati",790000.9080);
		Employee e4 = new Employee(100,"Suchita",89000.1234);
		
		TreeSet<Employee> t1 = new TreeSet<>();
		
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		
		for(Employee y : t1) {
			System.out.println(y);
		}
	}
	}


