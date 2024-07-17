package com.java.symboisis.interfaces;

public class Class_3 implements Interface_3{

	@Override
	public void productdetails() {
		// TODO Auto-generated method stub
		
		System.out.println("\n Mobile\n");
		System.out.println("\n1.High quality camera\n2.780000/-\n3.High Battary life");
		
	}

	@Override
	public void stores() {
		// TODO Auto-generated method stub
		System.out.println("\n1.Sangsumg\n2.Iphone\n3.Realme");
		
	}
	
	public static void main(String[] args) {
		
		Class_3 c = new Class_3();
		
		c.productdetails();
		c.stores();
	}
	

}
