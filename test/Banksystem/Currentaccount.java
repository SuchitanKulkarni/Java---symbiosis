package com.java.symboisis.test.Banksystem;

import java.util.Scanner;

public class Currentaccount implements Account{
	
	Scanner sc = new Scanner(System.in);

	@Override
	public double deposite(double a) {
		
		
		
		double amount;
		System.out.println("\n Enter the Amount : ");
		
		
		amount = sc.nextDouble();
		
		
		System.out.println("Amount : " + (a+amount));
		return amount+a;
	}

	@Override
	public double withdraw(double b) {
		double c;
		
		System.out.println("\n Enter the Amount to Withdraw : ");
		
		c = sc.nextDouble();
		
		if(c<b) {
			System.out.println("Withdraw is done");
			return (b-c);
		}
		else {
			System.out.println("Your Balance is not sufficient");
			return b;
		}
	}

	@Override
	public void calculateinterest() {
		System.out.println("----");
		
	}

	@Override
	public void viewBalance(double d) {
		
		System.out.println("Balance : " + d);
		
	}
	
	

	
}
