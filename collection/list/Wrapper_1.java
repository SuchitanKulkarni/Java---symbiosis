package com.java.symboisis.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;


/*
 * using wrapper class we are storing the collection in another collection.
 */
public class Wrapper_1 {
	
	public static void main(String[] args) {
		
		ArrayList<Object> a1 = new ArrayList<>();
		
		a1.add(78);
		a1.add(18);
		a1.add(78.8);
		a1.add("ajax");
		a1.add('p');
		a1.add("java");
		
		LinkedList<Object>l1 = new LinkedList<>();
		
		l1.addAll(a1);
		
		l1.add("naina");
		l1.add("priti");
		l1.add("asha");
		l1.add("ania");
		
		Vector<Object> v1 = new Vector<>();
		
		v1.addAll(l1);
		
		for(Object y : v1 ) {
			
			System.out.println(y);
		}
		
		
		
		
	}

}
