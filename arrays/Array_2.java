package com.java.symboisis.arrays;

import java.util.Scanner;

public class Array_2 {
	
	public static void main(String[] args) {
		
		int []  a = new int [4];
		
		Scanner sc = new Scanner(System.in);
		
	 System.out.println("Enter the 4 elements : ");
		
		for(int i = 0;i<a.length;i++) {
			
			a[i] = sc.nextInt();
			
		}
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
		 System.out.println("-----Sorted - ascending----------\n ");
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(" " + a[i]);
		}
		
		
		for(int i=a.length-1;i>=0;i--) {
			
			for(int j=i-1;j>=0;j--) {
				
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
		 System.out.println("-----Sorted - descending----------\n ");
			
			for(int i=0;i<a.length;i++) {
				
				System.out.println(" " + a[i]);
			}
	}

}
