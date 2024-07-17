package com.java.symboisis.exceptionalhandleing;

public class ExH_4_Null {
	
	public static void main(String[] args) {
		
		String s = null;
		
		try {
			
			System.out.println(s.toUpperCase());
			
		} catch (NullPointerException e) {
			
			System.out.println("\n enter the value");
			// TODO: handle exception
		}
	}

}
