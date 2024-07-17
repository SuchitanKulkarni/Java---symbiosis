package com.java.symboisis.exceptionalhandleing;

public class ExH_7 {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		try {
			System.out.println(10/0);
		} 
		
		catch (NullPointerException e) {
			// TODO: handle exception
		}
		finally {
			System.out.println("this is close");
		}
		
		System.out.println("end");
	}

}
