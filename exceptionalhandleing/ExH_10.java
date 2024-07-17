package com.java.symboisis.exceptionalhandleing;

public class ExH_10 {
	/*
	 * here the printstacktrace will not provide the full detail of the exception because the sleep method is already defined
	 * in the thread class.
	 */
	
	public static void main(String[] args) {
		
		// Intrruptedexception
		
		for(int i=0;i<=5;i++) {
			
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
