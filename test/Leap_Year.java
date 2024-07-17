package com.java.symboisis.test;

import java.util.Scanner;

public class Leap_Year {
	
	public int leap(int year) {
		
		if(year%4==0) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		
		Leap_Year b = new Leap_Year();
		
		int a;
		
		Scanner scanner = new Scanner(System.in);
		
		System.err.println("Enter the year : ");
		a = scanner.nextInt();
		
		if(b.leap(a)==1) {
			
			System.out.println("\nYear is leap year");
		}
		else {
			System.out.println("\n Year is not a leap year");
		}
	}

}
