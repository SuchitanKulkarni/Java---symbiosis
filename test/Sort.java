package com.java.symboisis.test;

import java.util.Scanner;

public class Sort {
	
	public static void main(String[] args) {
		
		int [] n = new int [4];
		
		System.out.println("\nEnter the 4 elements : ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n-----------Integer sorting---------\n");
		
		
		for(int i=0;i<4;i++) {
			
			n[i] = sc.nextInt();
			
		}
		
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<4;j++) {
				
				if(n[i]>n[j]) {
					
					int temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
		}
		

		for(int i=0;i<4;i++) {
			
			System.out.println(" " +n[i]);
		}
		
		System.out.println("\n----------String sorting------------\n");
		
		
		String g = "Hello";
		

		int p = g.length()-1;
		
		char [] c = new char[g.length()];
		
		for(int i=0;i<g.length();i++) {
			
			c[i] = g.charAt(i);
		}
		
		for(int i=0;i<p+1;i++) {
			for(int j=i+1;j<p;j++) {
				
				if(c[i]>c[j]) {
					
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		
		for(int i=0;i<p+1;i++) {
			
			System.out.println(" " + c[i]);
		}
		
		
		
		
	}

}
