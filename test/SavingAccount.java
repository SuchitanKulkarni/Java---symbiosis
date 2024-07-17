package com.java.symboisis.test;

public class SavingAccount extends BankAccount {
	
	public void withdraw() {
		
		System.out.println("\n Enter the amount to withdraw : ");
		
		double wid = sc.nextDouble();
		
		if(wid<saving) {
			
			saving = saving-wid; 
			
			System.out.println("\n Balance : " + saving);
		}
		else {
			System.out.println("Unsaficient balance");
		}
		
	}
	
	public static void main(String[] args) {
		
		SavingAccount s = new SavingAccount();
		
		s.Deposite();
		s.withdraw();
	}

}
