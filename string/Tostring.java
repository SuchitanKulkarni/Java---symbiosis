package com.java.symboisis.string;

public class Tostring {
	
	int cost;
	
	public Tostring(int cost) {
		// TODO Auto-generated constructor stub
		
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "cost"+cost;			//the concatination is mandatory
	}
	
	public static void main(String[] args) {
		
		Tostring  t1 = new Tostring(89);
		
		System.out.println(t1.toString()); // tostring method is used to get the actual output rather tthen the full qalified class uri.
	}
}
