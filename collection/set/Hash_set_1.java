package com.java.symboisis.collection.set;

import java.util.HashSet;

public class Hash_set_1 {
	
	public static void main(String[] args) {
		
		HashSet<Object> h1 = new HashSet<>();
		
		h1.add(10);
		h1.add(20);
		h1.add("sql");
		h1.add(null);
		h1.add(30);
		h1.add(20);
		h1.add(null);
		
		System.out.println(h1);
		
		System.out.println("\n "+h1.size());
		
	
		
		for(Object y : h1) {
			
			System.out.println(y);
		}
		
	}

}
