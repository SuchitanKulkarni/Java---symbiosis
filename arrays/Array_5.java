package com.java.symboisis.arrays;

import java.util.Scanner;

public class Array_5 {
	
	public static void main(String[] args) {
		
		int [] a = new int[4];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the  4 elements : ");
		
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
			
		}
		
		int count = 0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					count++;
					
				}
			}
		}
		
		System.out.println("The count of duplicate elements is : " + count);
		
		
	}

}
