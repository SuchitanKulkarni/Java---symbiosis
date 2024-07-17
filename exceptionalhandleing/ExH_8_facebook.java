package com.java.symboisis.exceptionalhandleing;

import java.util.Scanner;

public class ExH_8_facebook {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("\n enter the name : ");
			String name = sc.next();
			
			System.out.println("\n enter the password : ");
			String pass = sc.next();
			
			
			
			try {
				
				System.out.println("\n reenter the name : ");
				 sc.next();
				String rname = null;
				System.out.println("\n reenter the password : ");
				String rpass = sc.next();
				
				if(name.length()==rname.length()) {
					if(pass.length()==rpass.length()) {
						System.out.println("\nwelcome to home");
					}
					else {
						System.out.println("\n wrong password");
					}
				}
				else {
					System.out.println("\nwrong username");
				}
				
				
			} catch (NullPointerException e) {
				
				System.out.println("\n======================= Null pointer exception=========================");
				
			}
		} catch (Exception e) {
			
			System.out.println("super class");
			
		}
	}

}
