package com.java.symboisis.comparator;

import java.util.TreeSet;

public class Studentsort {

	public static void main(String[] args) {
		
		Student s1 = new Student(78, "nikita");
		Student s2 = new Student(56, "priyal");
		
		Studentsortage age = new Studentsortage();
		
		TreeSet<Student> t1 = new TreeSet<>(age);
		
		t1.add(s1);
		t1.add(s2);
		
		for(Student y:t1) {
			
			System.out.println(y);
		}
	}
}
