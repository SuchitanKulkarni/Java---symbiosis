package com.java.symboisis.collection.set;

import java.util.TreeSet;

public class Treeset {
	
	public static void main(String[] args) {
		
		TreeSet<Object> t1 = new TreeSet<>();
		
		t1.add(78);
	//	t1.add("java");
		t1.add(90);
		//t1.add("sql");
	//	t1.add(null);
		t1.add(10);
		System.out.println("\n");
		
		System.out.println(t1);
		
		System.out.println("\n");
		
		
		String s1 = "A";
		String s2 = "B";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s1));
		
		System.out.println("\n");
		
		
		int a = 10;
		int b = 20;
		
		Integer a1 = new Integer(a);			//auto boxing is implemented
		Integer b1 = new Integer(b);
		
		System.out.println(a1.compareTo(b1));
		System.out.println(b1.compareTo(a1));
		System.out.println(b1.compareTo(b1));
		
		TreeSet<Object> t2 = new TreeSet<>();
		
		t2.add(10);
		t2.add(20);
		t2.add("java");
		t2.add(null);
		
		for(Object y : t2) {
			
			System.out.println(y);
		}
		
		   
	}

}
