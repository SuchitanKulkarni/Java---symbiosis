package com.java.symboisis.arrays;

import java.util.Scanner;

public class Array_1 {
	
	public static void main(String[] args) {
		
		int [] a = new int[4];
		char [] c = new char[4];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 4 elements : ");
		
		/*for(int i = 0;i<a.length;i++) {
			
			a[i] = sc.nextInt();
			
		}*/
		
		System.out.println("-----------integer------------- ");
		
		for(int i = 0;i<a.length;i++) {
				
				System.out.println(" " + a[i]);
				
		}
		
		System.out.println("-----------charater------------- ");
		
		for(int i = 0;i<c.length;i++) {
				
				System.out.println(" " + c[i]);
				
		}
	}
}
