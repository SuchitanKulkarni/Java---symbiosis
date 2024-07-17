package com.java.symboisis.comparable;

import java.util.TreeSet;

public class SortLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop l1=new Laptop(5.0f, 34989, "HP");
		Laptop l2=new Laptop(4.5f, 34989, "HP");
		Laptop l3=new Laptop(3.8f, 34989, "HP");
		
		TreeSet<Laptop> t1 = new TreeSet<>();
		
		t1.add(l1);
		t1.add(l2);
		t1.add(l3);
		
		for(Laptop y : t1) {
			
			System.out.println(y);
		}


	}

}
