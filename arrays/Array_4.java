package com.java.symboisis.arrays;

import java.util.Scanner;

public class Array_4 {
	
	public static void main(String[] args) {
		
		int [] a = new int[4];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the  4 elements : ");
		
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
			
		}
		
		Double sum = 0d;
		
		for(int i=0;i<a.length;i++) {
			
			sum+=a[i];
		}
		
		System.out.println("\n Average is : " + sum/a.length);
	}

}
