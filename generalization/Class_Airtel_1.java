package com.java.symboisis.generalization;

public class Class_Airtel_1 implements Interface_1 {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
		System.out.println("\n 25 days unlimited calling");
		
	}

	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("\n speed internet");
		
	}

	@Override
	public void network() {
		// TODO Auto-generated method stub
		
		System.out.println("\n High network ");
		
	}
	
	public void airtel() {
		System.out.println("\n on time service of Airtel");
	}
	
	public static void main(String[] args) {
		
Class_Airtel_1 c = new Class_Airtel_1();
		
		c.call();
		c.network();
		c.internet();
		c.airtel();
	}

}
