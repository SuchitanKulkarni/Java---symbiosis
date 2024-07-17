package com.java.symboisis.test.Banksystem;

import java.util.Scanner;

public class BankAccount {
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter the number of Account : ");
		n = sc.nextInt();
		
		int [] account = new int[n] ;
		
		int accountno;
		
		for(int i=0;i<n;i++) {
			
			System.out.println("\nEnter the account no : ");
			accountno = sc.nextInt();
			
			account[i] = accountno;
		}
		
		System.out.println("\n-----------Banking System------------\n");
		
		for(int i=0;i<n;i++) {
			
			System.out.println("For the  : "+ account[i]+" Account");
			
			int ch,p;
			
			Double curretDouble;
			Double savingDouble;
			
			System.out.println("\n Enter the Current Balanec : ");
			curretDouble = sc.nextDouble();
			
			System.out.println("\n Enter the Saving Balance : ");
			savingDouble = sc.nextDouble();
			
			System.out.println("\n press\n1. Current Balance\n2. Saving Balance");
			ch = sc.nextInt();
			
			switch(ch) {
			
			case 1 : System.out.println("\n---------Current _ Balance------------\n");
						while(true) {
							
							System.out.println("Enter the choice : \n 1.Deposite\n 2.Withdraw\n 3.Balance");
							p = sc.nextInt();
							Currentaccount a = new Currentaccount();
							
							switch(p) {
							
								case 1 : 
								
											curretDouble = a.deposite(curretDouble);
											
											break;
								case 2 : 
											curretDouble = a.withdraw(curretDouble);
											break;
											
								case 3 :    a.viewBalance(curretDouble);
											break;
								default : System.out.println("\nwrong choice");
							}
							
							System.out.println("Do you want to continue : yes(1)");
							int q = sc.nextInt();
							
							if(q!=1) {
								break;
							}
						}
						
						break;
						
			case 2:
				System.out.println("\n---------Saving _ Balance------------\n");
				while(true) {
					
					System.out.println("Enter the choice : \n 1.Deposite\n 2.Withdraw\n 3.Interest\n 4.Balance");
					p = sc.nextInt();
					SavingAccount a = new SavingAccount();
					
					switch(p) {
					
						case 1 : 
						
									savingDouble = a.deposite(savingDouble);
									
									break;
						case 2 : 
									savingDouble = a.withdraw(savingDouble);
									break;
									
						case 3 :   a.calculateinterest();
									
						case 4 :    a.viewBalance(savingDouble);
									break;
						default : System.out.println("\nwrong choice");
					}
					
					System.out.println("Do you want to continue : yes(1)");
					int q = sc.nextInt();
					
					if(q!=1) {
						break;
					}
				}
				
				break;
				
		default : System.out.println("wrong input");
			}
		}
		
		
		
		
		
	}

}
