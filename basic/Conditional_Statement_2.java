package com.java.symboisis.basic;

public class Conditional_Statement_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String unameString = "Pratik2321";
		String pwdString = "12345";
		
		if(unameString=="Pratik2321") {
			
			if(pwdString=="12345") {
				
				System.out.println("Logined");
			}
			else {
				System.out.println("invalid Password");
			}
		}
		else {
			System.out.println("invalid username");
		}
		
	}

}
