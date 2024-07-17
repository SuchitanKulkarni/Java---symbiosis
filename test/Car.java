package com.java.symboisis.test;

public class Car extends Vehicle {
	
	public void startEngine() {
		
		System.out.println("Start Engine of Car");
	}
	
	public void stopEngine() {
		
		System.out.println("Stop Engine of Car");
	}
	
	public static void main(int p) {
		
		System.out.println("Overloaded main");
		
	}
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		c1.startEngine();
		c1.startEngine();
		main(0);
	}

}
