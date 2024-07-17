package com.java.symboisis.test;

// switch statement is the better option for the conditional statement .
// by switch we can check multiple conditions and if any condition is not matched then default will execute.

public class Person {
	
	private String nameString;
	private int age;
	
	Person(String name,int age){
		
		this.nameString = name;
		this.age = age;
		
		System.out.println("\n Name : " + nameString + "\n Age : " + age);
		
		
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Neha", 24);
		Person p2 = new Person("navin", 15);
		
		
	}

}
