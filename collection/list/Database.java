package com.java.symboisis.collection.list;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Database {
	
	public static void main(String[] args) {
		
		LinkedList<Object> d1 = new LinkedList<Object>();
		ArrayList<Object> a1 = new ArrayList<Object>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Enter the name : ");
		d1.add (sc.next());
		
		System.out.println("\n Enter the address : ");
		d1.add (sc.next());
		
		System.out.println("\n enter the Id : ");
		d1.add(sc.nextInt());
		
		System.out.println("\n Enter the name : ");
		d1.add (sc.next());
		
		System.out.println("\n Enter the address : ");
		d1.add (sc.next());
		
		System.out.println("\n enter the Id : ");
		d1.add(sc.nextInt());
		
		a1.addAll(d1);
		
		System.out.println("\n Data is : \n");
		
		System.out.println(a1);
		
		
		
		
		
		
		
	}

}
