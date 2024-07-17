package com.java.symboisis.test;

import java.util.Scanner;

public class Application_for_job {
	
	public String nameString;
   public int year_of_exp;
   public	String eduString;
   
   Scanner sc = new Scanner(System.in);
   
	
	public void Details() {
		
		System.out.println("\n Enter the Full name using _ instead of space : ");
		nameString = sc.next();
		
		System.out.println("\n Enter the Education : ");
		eduString = sc.next();
		
		System.out.println("\n Enter the Year of Experience : ");
		year_of_exp = sc.nextInt();
		
		if(year_of_exp<=1) {
			
			try {
				throw new NotQualifiedCandidate();
			} catch (NotQualifiedCandidate e) {
				
				e.printStackTrace();
				System.out.println(e.getMessage());
				// TODO: handle exception
			}
		}
		
		else {
			
			System.out.println("Application Done Successfully");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		Application_for_job j = new Application_for_job();
		
		j.Details();
	}

}
