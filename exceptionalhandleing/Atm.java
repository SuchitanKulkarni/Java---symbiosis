package com.java.symboisis.exceptionalhandleing;

import java.util.Scanner;


public class Atm {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int  balance = 10;
		
		System.out.println("Enter the amount : ");
		int amount = sc.nextInt();
		
		if(amount<=balance) {
			
			System.out.println("done");
		}
		else {
			try {
				throw new InsufficientResourcesException();
			} catch (InsufficientResourcesException e) {
				
				System.out.println("Insufficient balance");
				// TODO: handle exception
				
				System.out.println(e.getMessage());    //null
			}
		}
	}

}
