package com.java.symboisis.abstraction;

import java.util.Scanner;

abstract class Abstract_3 {
	

	public int get() {
		
		System.out.println("\n Enter the data :");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		return n;
		
	}
	
	abstract void fill();
	abstract void compair();

}
