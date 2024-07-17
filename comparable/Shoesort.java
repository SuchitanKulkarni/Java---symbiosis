package com.java.symboisis.comparable;

import java.util.TreeSet;

public class Shoesort {
	
	public static void main(String[] args) {
		

		Shoes s1 = new Shoes(23000, 5);
		Shoes s2 = new Shoes(8900, 6);
		
		TreeSet<Shoes> t1 = new TreeSet<>();
		
		t1.add(s1);
		t1.add(s2);
		
		
		for(Shoes y : t1) {
			
			System.out.println(y);
		}
	}

}
