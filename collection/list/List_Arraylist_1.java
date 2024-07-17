package com.java.symboisis.collection.list;

import java.util.ArrayList;

public class List_Arraylist_1
{
	public static void main(String[] args) 
	{
		ArrayList<Object> a= new ArrayList<Object>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add("java");
		a.add('h');
		a.add("sql");
		a.add(30);
		a.add(null);
		a.add("Hello");
		a.add("hi");
		a.add(67);
		
		System.out.println("\n--------First_arraylist-----------\n");
		
		
		System.out.println("\n " +a);
		
		System.out.println("\n " +a.get(3));	//get is used to get the particular data based 0 index position
		
		System.out.println("\n " +a.contains("sql"));   // contains method is used to check wether the data is present or not.
		
		System.out.println("\n " +a.remove(4));	// remove is used to remove the data present in the particular position.
		
		System.out.println("\n "+ a);
		
		System.out.println("\n "+a.isEmpty());
		
		a.clear(); 		// clear is used to remove all the data in the array.
		
		System.out.println("\n " +a);
		
		ArrayList<Object> a1= new ArrayList<Object>();
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		System.out.println("\n--------second_arraylist-----------\n");
		
		
		System.out.println("\n " +a1.indexOf(10));
		System.out.println("\n " +a1.lastIndexOf(10));		//
		
		
		System.out.println("\n===========array_1========\n");
		
		
		for(int i=0;i<a1.size();i++) {
			
			System.out.println( a1.get(i));
		}
		
		System.out.println("\n===========array_2========\n");
		
		for(int i=a1.size()-1;i>=0;i--) {
			
			System.out.println( a1.get(i));
		}
		
	}

}
