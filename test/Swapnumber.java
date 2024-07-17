package com.java.symboisis.test;

public class Swapnumber {
	public static void main(String[] args) {
		int a = 7;
		int b = 8;
		
		System.out.println("\n=========Integer=========\n");
		
		int sum = a+b;
		int diff = a-b;
		
		b = (sum + diff)/2;
		
		a = (sum - diff)/2;
		
		
		
		System.out.println("\n a = "+ a+ "\n b = " + b);
		
		System.out.println("\n=========String=========\n");
		
		 String s1 = "heeloo";
		 String s2 = "hi";
		 
		s1= s1+s2;
		
		s2 = s1.substring(0,s1.length()-s2.length());
		
		s1 = s1.substring(s2.length());
		
		System.out.println("\n s1 = " + s1 + "\n s2 = "+ s2);
	}

}
