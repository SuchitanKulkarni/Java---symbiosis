package com.java.symboisis.multithreading;

public class createthred extends Thread {
	
	@Override
	
	public void run() {
		
		System.out.println("this is thred");
	}
	
	
	public static void main(String[] args) {
		
		createthred c = new createthred();
		
		c.start();
		
	}

}
