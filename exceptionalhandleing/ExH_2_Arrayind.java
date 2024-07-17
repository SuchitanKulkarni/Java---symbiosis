package com.java.symboisis.exceptionalhandleing;

public class ExH_2_Arrayind {

	public static void main(String[] args) {
		
		int [] a = new int[4];
		
		try {
			
			System.out.println(a[5]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			
			System.out.println("do not access the undefined space");
		}
	}
}
