package com.java.symboisis.comparable;

import java.util.TreeSet;

public class Carsort {
	
	public static void main(String[] args) {
		
		TreeSet<Car> t1 = new TreeSet<>();
		
		Car c1 = new Car(200);
		Car c2 = new Car(100);
		Car c3 = new Car(300);
		
		t1.add(c1);
		t1.add(c2);
		t1.add(c3);
		
		for(Car y:t1) {
			
			System.out.println(y); 		//to print the value we have to override the compareto method which is present in the comparable class.
		}
		
	}
}
