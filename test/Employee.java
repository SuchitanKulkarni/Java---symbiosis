package com.java.symboisis.test;

public class Employee {
	
	public void bonuses(double p) {
		
		System.out.println("\n---Bonues--\n");
		
		p = p*50;
		
		System.out.println(" " + p);
		
	}
	
	public void performanacereport(float p) {
		
		System.out.println("performanacereport");
		
		if(p*5>78) {
			
			System.out.println("High ");
		}
		else if(p*5<78 && p*5>40) {
			
			System.out.println("Medium");
			
		}
		else {
			System.out.println("low");
		}
		
		
		
	}
	
	public void managingprojects(int p) {
		
		System.out.println("managingprojects");
		
		System.out.println("Number of Projects : " + p);
		
	}
	

}
