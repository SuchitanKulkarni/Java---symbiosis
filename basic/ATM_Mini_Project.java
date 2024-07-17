package com.java.symboisis.basic;

public class ATM_Mini_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userString ="Suchita123";
		String pwdString ="1234";
		
		float money = 300000f;
		float withdrawmoney= 2000f;
		String ppwdString;
		int amount;
		String number = "9876054321";
		short OTP = 0,OTP1;
		
		System.out.println("---------ATM_Machine------------");
		
		System.out.println("\nPress \n1.Withdraw\n2.Reset Pin\n3.Check Balance\n4.Deposite");
		
		int a = 4;
		
		switch(a) {
		
		case 1 : System.out.println("\n------ Withdraw---------------");
				 System.out.println("\nEntered amount is 2000");
				 
				 if(money>withdrawmoney) {
					 System.out.println("\nEnter the Pin");
					 
					 if(pwdString =="1234") {
						 
						 System.out.println("\nTransaction is processed please wait....");
						 money = money-withdrawmoney;
						 System.out.println("\nTransation is Done");
					 }
					 else {
						System.out.println("\nWrong Pin");
					}
				 }
				 else {
					System.out.println("\nInsufficient Balance");
				}
				 
				break;
				
		case 2 : System.out.println("\n-------------Reset Pin------------------");
				 System.out.println("\nInsert your ATM Card");
		 		 System.out.println("\n press\n1.Enter pin\n2.Forgot pin");
		 		 System.out.println("\n Fogot pin : \n1.Generate OTP\n2.Validate OTP");
		 		 
		 		 System.out.println("\nGenerate OTP");
		 		 
		 		 if(number == "9876054321") {
		 			 
		 			 OTP = 4574;
		 		 }
		 		
		 		System.out.println("\nRemove your ATM Card");
		 		
		 		 System.out.println("\nInsert your ATM Card");
		 		 System.out.println("\n press\n1.Enter pin\n2.Forgot pin");
		 		 System.out.println("\n Fogot pin : \n1.Generate OTP\n2.Validate OTP");
		 		 
		 		System.out.println("\nValidate OTP");
		 		
		 		System.out.println("Enter the OTP value");
		 		
		 		 OTP1 = 4574;
		 		 if(OTP==OTP1) {
		 			 System.out.println("Please enter the new pin");
		 			 
		 			 String pinString = "4567";
		 			 System.out.println("New pin : " + pinString);
		 			 
		 			 pwdString = pinString;
		 			 
		 			 System.out.println("New pin is created successfully");
		 			 
		 		 }
		 		 else {
		 			 System.out.println("invalid OTP");
		 		 }
		 		 break;
		 		 
		case 3: System.out.println("\n-------------Check Balance------------------");
		 		System.out.println("\nEnter the pin");
		 		
		 		ppwdString = "1234";
		 		System.out.println("\nPin : " + ppwdString);
		 		
		 		if(pwdString.equals(ppwdString)) {
		 			
		 			System.out.println("\nMoney : " + money);
		 		}
		 		else {
					System.out.println("\ninvalid Password");
				}
		 		break;
		 		
		case 4:System.out.println("\n-------------Deposite------------------");
		 	   System.out.println("\nEnter the number between 10 to 99 :");
		 	   System.out.println("\nNumber is 25");
		 	   System.out.println("\nEnter the pin:");
		 	   
		 	   ppwdString = "1234";
		 	   
		 	   System.out.println("\nPin : " + ppwdString);
		 	   
		 	   if(pwdString.equals(ppwdString)) {
		 		   
		 		   System.out.println("\nEntered in banking");
		 		   System.out.println("\nentered in deposite");
		 		   System.out.println("\nEntered in cash deposite");
		 		   System.out.println("\nThe deposite limit is 5000");
		 		   System.out.println("\nSelect the amount type \n1. current\n2.saving");
		 		   System.out.println("\nEntered in saving");
		 		   
		 		   amount = 3000;
		 		   
		 		   if(amount<=5000) {
		 			   
		 			   money = money+amount;
		 			   System.out.println("Amount successfully deposited");
		 		   }
		 	   }
		 	   
		 	   break;
		 	   
		 default: System.out.println("Invalid Try");
		 	   
				 
		}

	}

}
