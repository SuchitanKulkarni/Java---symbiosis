package com.java.symboisis.test;

public class Motercycle extends Vehicle{
	
	public void startEngine() {
		
		System.out.println("Start Engine of Motorcycle");
	}
	
	public void stopEngine() {
		
		System.out.println("Stop Engine of Motercycle");
	}
	
	public static void main(String[] args) {
		
		Motercycle m = new Motercycle();
		
		m.startEngine();
		m.stopEngine();
	}

}
