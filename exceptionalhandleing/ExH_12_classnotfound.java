package com.java.symboisis.exceptionalhandleing;


public class ExH_12_classnotfound {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Driver is not loaded");
			e.printStackTrace();
		}
		
	}

}
