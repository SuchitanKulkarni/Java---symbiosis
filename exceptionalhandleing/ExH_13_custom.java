package com.java.symboisis.exceptionalhandleing;

import java.util.Scanner;

public class ExH_13_custom extends Exception{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ID");
		String id = sc.next();
		System.out.println("Enter the password : ");
		int pass = sc.nextInt();
		
		if(id.equals("Admin")) {
			System.out.println("correct id");
			
			if(pass==1234) {
				
				System.out.println("Correcct pass");
			}
			else {
				
				try {
					throw new ExH_13_custom();
				} catch (ExH_13_custom e) {
					// TODO: handle exception
					
					e.printStackTrace();
				}
			}
		}
		
		
		

}
}
