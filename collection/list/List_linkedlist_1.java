package com.java.symboisis.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_linkedlist_1 {
	
	public static void main(String[] args) {
		
		ArrayList<Object> a= new ArrayList<Object>();
		a.add(10);
		a.add(10);
		a.add(30);
		a.add("java");
		a.add('h');
		
		
		LinkedList<Object> l1 = new LinkedList<Object>();
		
		l1.addAll(a);
		
		System.out.println("\n "+ l1);
		
		System.out.println("\n "+l1.containsAll(a));
		
		System.out.println("\n "+l1.removeAll(a));
		
		System.out.println("\n " +l1.addAll(a));
		
		System.out.println("\n " + l1.remove(1));
		
		System.out.println("\n "+l1);
		
		System.out.println("\n "+ l1.containsAll(a));
		
		l1.add(1,190);
		
		System.out.println("\n "+ l1);
		
		l1.set(4, 567);
		
		System.out.println("\n "+ l1);
		
		
		
		
		
		
		
		
	}

}
