package com.java.symboisis.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Generics {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList();
		
		System.out.println("\n=========Integer_Generics==============\n");
		
		l1.add(10);
		l1.add(20);
		l1.add(70);
		
		for(int y: l1) {
			
			System.out.println(y);
		}
		
		ArrayList<String> a1 =  new ArrayList();
		
		System.out.println("\n=========String_Generics==============\n");
		
		a1.add(null);
		a1.add("java");
		a1.add("hello");
		
		for(String y: a1) {
			
			System.out.println(y);
		}
		
		LinkedList<Object> l2 = new LinkedList();
		
		System.out.println("\n=========Object_Generics==============\n");
		
		l2.add(21);
		l2.add(121);
		l2.add("java");
		l2.add('h');
		l2.add(null);
		l2.add(921);
		
		
		for(Object y: a1) {
			
			System.out.println(y);
		}
		
		
		
	}

}
