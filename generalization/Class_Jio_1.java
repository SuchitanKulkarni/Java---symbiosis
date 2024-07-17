package com.java.symboisis.generalization;

public class Class_Jio_1  implements Interface_1{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
		System.out.println("\n 28 days unlimited calling");
		
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
	
	public void jio() {
		
		System.out.println("\n on time service of jio");
	}
	
	public static void main(String[] args) {
		
		Class_Jio_1 c = new Class_Jio_1();
		
		c.call();
		c.network();
		c.internet();
		c.jio();
	}
	

}
