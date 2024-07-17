package com.java.symboisis.test;

import java.util.Scanner;

public class Customexception_oddnumber {
	
	public void check(int a) {
		
		if(a%2==1) {
			
			try {
				throw new OddNumberException();
			}
			catch (OddNumberException e) {
				// TODO: handle exception
				
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		else {
			System.out.println("\n Your input is :" + a);
		}
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter the Number  : ");
		
		Customexception_oddnumber c = new Customexception_oddnumber();
		
		c.check(sc.nextInt());
		
	}
}
