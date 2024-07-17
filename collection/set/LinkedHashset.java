package com.java.symboisis.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashset {
	public static void main(String[] args) {
		
		LinkedHashSet<Object> l1 = new LinkedHashSet<>();
		
		l1.add(78);
		l1.add(80);
		l1.add(70);
		l1.add("java");
		l1.add("sql");
		l1.add(null);
		
		System.out.println(l1); 			//here order of insertion is mandatory. 
	}

}
