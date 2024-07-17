package com.java.symboisis.abstraction;

import java.util.Scanner;

public class Concrete_3 extends Abstract_3{
	
	int p;
	
	@Override
	void fill() {
		
		p = get();
		
	}

	@Override
	void compair() {
		// TODO Auto-generated method stub
		
		System.out.println("\nReenter the value : ");
		
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if(p==n) {
			System.out.println("\n Correct number ");
		}
		else {
			System.out.println("\n wrong number ");
		}
		
	}
	
	public static void main(String[] args) {
		
		Concrete_3 c = new Concrete_3();
		
		c.fill();
		c.compair();
	}
	

}
