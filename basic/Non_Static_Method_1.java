package com.java.symboisis.basic;

public class Non_Static_Method_1 {
	
	public void Company() {
		System.out.println("This is the Microsoft from same class\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Non_Static_Method_1 p = new Non_Static_Method_1();
		Non_Static_Method_2 q = new Non_Static_Method_2();
		
		p.Company();
		q.Campus();

		
	}

}
