package com.java.symboisis.collection.list;

import java.util.LinkedList;

public class Employee {
	
	String name;
	int age;
	double salary;
	
	Employee(String name,int age,double salary){
		
		LinkedList<Object> l1 = new LinkedList<>();
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		
		
		l1.add(name);
		l1.add(age);
		l1.add(salary);
	}

}
