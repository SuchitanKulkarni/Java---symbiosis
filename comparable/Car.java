package com.java.symboisis.comparable;

public class Car implements Comparable<Car>{
	
	int cost;
	
	public Car(int cost) {
		
		this.cost = cost;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "cost : "+cost;
	}

	@Override
	public int compareTo(Car o) {
		
		return this.cost-o.cost;
	}
	

}
