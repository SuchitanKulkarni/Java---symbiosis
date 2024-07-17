package com.java.symboisis.basic;

public class Conditional_Statement_1 {

	public static void main(String[] args) {
		
		int marks = 200;
		
		if (marks<=0 || marks >=101) {
			System.out.println("Invalid data");
		}
		else if (marks >=40 && marks<=50) {
			System.out.println("just pass");
		}
		else if (marks>=51 && marks<=60) {
			System.out.println("second class");
		}
		else if (marks>=61 && marks <=70) {
			System.out.println("First class");
		}
		else if (marks >=71 && marks <=89) {
			System.out.println("distinstion");
		}
		else {
			System.out.println("rank");
		}
		

	}

}
