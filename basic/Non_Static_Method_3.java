package com.java.symboisis.basic;

import java.util.Scanner;

public class Non_Static_Method_3 {
	
	public void avg(int a,int b) {
		
		System.out.println("Addition : " + (a+b));
	}
	
	public String name(String name){
		return name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Enter the First value : ");
		int s = sc.nextInt();
		
		System.out.println("\n ENter the second value : ");
		int q = sc.nextInt();
		
		Non_Static_Method_3 p = new Non_Static_Method_3();
		
		p.avg(s, q);
		System.out.println("Enter the name : ");
		String sname = sc.next();
		
		System.out.println("Name is : " + p.name(sname));

	}

}
