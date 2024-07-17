package com.java.symboisis.comparable;

public class Student implements Comparable<Student>{
	
	int id;
	String nameString;
	
	public Student(int id,String nameString) {
		
		this.id = id;
		this.nameString = nameString;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id : " + id + " student :  " + nameString;
	}

	@Override
	public int compareTo(Student o) {
		
		return this.nameString.compareTo(o.nameString);   		// for sorting string.
	}
	
	

}
