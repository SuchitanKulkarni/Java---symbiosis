package com.java.symboisis.test.Banksystem;

import java.util.Scanner;

public class SavingAccount implements Account{
	
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
		// TODO Auto-generated method stub
		
		double loan;
		float rate = 3.5f;
		float period;
		
		System.out.println("\n Enter the Loan : ");
		loan = sc.nextDouble();
		
		System.out.println("\n Enter the Period : ");
		period = (float) sc.nextDouble();
		
		double interest = loan * rate*period;
		
		System.out.println("\n Interest : " + interest);
		
		
	}

	@Override
	public void viewBalance(double d) {
		// TODO Auto-generated method stub
		
		System.out.println("\n Balance : " + d);
		
	}

}
