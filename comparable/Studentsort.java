package com.java.symboisis.comparable;

import java.util.TreeSet;

public class Studentsort {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(109, "Naina");
		Student s2 = new Student(106, "Anv");
		Student s3 = new Student(301, "kaveri");
		
		TreeSet<Student> t1 = new TreeSet<>();
		
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		
		for(Student y : t1) {
			System.out.println(y);
		}
	}

}
