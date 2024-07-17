package com.java.symboisis.exceptionalhandleing;

import java.util.Scanner;

//why runtime exceptions are class

public class ExH_1_Arithmatic {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Ener the vale of A : ");
		int a = sc.nextInt();
		System.out.println("\n ENter the value of b : ");
		int b = sc.nextInt();
		
		
		try {
			
			System.out.println("\n ans : " + a/b);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println("\n Do not devide by zero");
		}
	}

}
