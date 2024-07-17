package com.java.symboisis.collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Detail_1 {
	

	
	static ArrayList<Object>a1 = new ArrayList<Object>();
	
	Detail_1(){
		
		
		
	}
	
	
	Detail_1(String name,int age,int std){
		
		
		
		
		a1.add(name);
		a1.add(age);
		a1.add(std);	
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("\n Enter the number of students");
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			String nameString;
			int age;
			int std;
			
			System.out.println("\n ENter the name of student : ");
			nameString= sc.next();
			
			System.out.println("\n Enter the age of student : ");
			age = sc.nextInt();
			
			System.out.println("\n Enter the std : ");
			std = sc.nextInt();
			
			Detail_1 d = new Detail_1(nameString, age, std);
			
		}
		
		
		
		for(Object y:a1) {
			System.out.println(y);
		}
		
	
		
		

		
	}
	
	

}
