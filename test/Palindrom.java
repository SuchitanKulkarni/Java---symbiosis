package com.java.symboisis.test;

import java.util.Scanner;

public class Palindrom {
	
	public static void main(String[] args) {
		
		String n;
		
		Scanner sc = new Scanner(System.in);
		
		int flag = 0;
		
		System.out.println("\n Enter the Number to check Palindrom : ");
		n = sc.next();
		
		int size = n.length();
		
		if(size%2==0) {
			
			int i=0;
			int j=size-1;
			
			while(i<=j) {
				
				if(n.charAt(i)!=n.charAt(j)) {
					
					flag = 1;
					
					System.out.println("\n it is not palindrom");
					break;
				}
				
				i++;
				j--;
			}
			
			if(flag==0) {
				System.out.println("\n It is a palindrom");
			}
			
			
		}
		else if(size%2==1) {
			
			int i=0;
			int j=size-1;
			
				while(i<j) {
				
				if(n.charAt(i)!=n.charAt(j)) {
					
					flag = 1;
					
					System.out.println("\n it is not palindrom");
					break;
				}
				
				i++;
				j--;
			}
			
			if(flag==0) {
				System.out.println("\n It is a palindrom");
			}
			
			
		}
		
		 
	}

}
