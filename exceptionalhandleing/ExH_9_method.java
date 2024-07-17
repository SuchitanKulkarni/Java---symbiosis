package com.java.symboisis.exceptionalhandleing;

public class ExH_9_method {
	
	public static void main(String[] args) {
		
		int a[] = new int[4];
		String s = null;
		
		try {
			//System.out.println(a[9]);
			try {
			//	System.out.println(10/0);
				try {
					System.out.println(s.length());
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace(); // for the information of which exception is occured
					System.out.println(e.getMessage());
				}
			} catch (Exception e) {
				// TODO: handle exception
				
				e.printStackTrace(); // for the information of which exception is occured
				System.out.println(e.getMessage());
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace(); // for the information of which exception is occured
			System.out.println(e.getMessage()); // to get the information of  why this exception occured
			
		
		}
	}

}
