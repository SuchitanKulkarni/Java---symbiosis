package com.java.symboisis.comparable;

public class Employee implements Comparable<Employee>{
	
	int id;
	String namString;
	Double salary;
	
	public Employee(int id,String namString,double salary) {
		
		this.id = id;
		this.namString = namString;
		this.salary = salary;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id : " + id+" name : " + namString+" salary : "+ salary;
	}
	
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.salary.compareTo(o.salary);
	}
	
	

}
