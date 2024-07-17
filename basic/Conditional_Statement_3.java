package com.java.symboisis.basic;

public class Conditional_Statement_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 20;
		String genderString = "Male";
		
		if (genderString == "female" || genderString =="Female") {
			
			if(age>=18) {
				
				if (age >=18 && age<=30) {
					
					System.out.println("\n is female");
					System.out.println("\n is valid for marriage");
					System.out.println("\n is valid for voting");
					System.out.println("\n is valid for government job");
					
				}
				else {
					
					System.out.println("\n is female");
					System.out.println("\n is valid for marriage");
					System.out.println("\n is valid for voting");
					System.out.println("\n invalid for government job");
					
				}
					
				}
			else {
				System.out.println("\n is female");
				System.out.println("\n not valid for marriage");
				System.out.println("\n notvalid for voting");
				System.out.println("\n invalid for government job");
			}
			
			
		}
		else if (genderString=="male" || genderString=="Male") {
			
			if(age >=18) {
				
				if(age >=21) {
					
					if(age<=30) {
						
						System.out.println("\n is male");
						System.out.println("\n is valid for marriage");
						System.out.println("\n is valid for voting");
						System.out.println("\n is valid for government job");
						
					}
					else {
						System.out.println("\n is male");
						System.out.println("\n is valid for marriage");
						System.out.println("\n is valid for voting");
						System.out.println("\n  invalid for government job");
					}
				}
				else {
					System.out.println("\n is male");
					System.out.println("\n invalid for marriage");
					System.out.println("\n is valid for voting");
					System.out.println("\n invalid for government job");
				}
			}
			else {
				System.out.println("\n is male");
				System.out.println("\n invalid for marriage");
				System.out.println("\n invalid for voting");
				System.out.println("\n invalid for government job");
			}
			
		}
		else {
			System.out.println("Loading");
		}

	}

}
