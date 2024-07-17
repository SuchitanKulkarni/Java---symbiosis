package com.java.symboisis.test;

import java.util.Scanner;

public class BankAccount {
	
	public double saving = 100000d;
	
	Scanner sc = new Scanner(System.in);
	
	public void Deposite() {
		
		System.out.println("\n Enter the amount to deposite");
		
		double dep = sc.nextDouble();
		
		saving = saving+dep; 
		
		System.out.println("\n Balance : " + saving);
	}
	
	public void withdraw() {
		
		System.out.println("\n Enter the amount to withdraw : ");
		
		double wid = sc.nextDouble();
		
		saving = saving-wid; 
		
		System.out.println("\n Balance : " + saving);
		
	}

}
