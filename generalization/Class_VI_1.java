package com.java.symboisis.generalization;

public class Class_VI_1 implements Interface_1 {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("\n 20 days unlimited calling");
		
	}

	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("\n speed internet");
		
	}

	@Override
	public void network() {
		// TODO Auto-generated method stub
		System.out.println("\n high network");
		
	}
	
	public void  VI() {
		
		System.out.println("\n on time service of VI");
	}
	public static void main(String[] args) {
		
Class_VI_1 c = new Class_VI_1();
		
		c.call();
		c.network();
		c.internet();
		c.VI();
	}

}
