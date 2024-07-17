package com.java.symboisis.comparator;

public class Student {
	
	String nameString;
	int age;
	
	public Student(int age, String nameString) {
		this.age =age;
		this.nameString = nameString;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " name : "+ nameString + ", age : "+age;
	}
	
	

}
