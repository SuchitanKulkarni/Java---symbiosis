package com.java.symboisis.comparable;

public class Shoes implements Comparable<Shoes>{
	
	int cost;
	int size;
	
	public Shoes(int cost,int size) {
		
		this.cost=cost;
		this.size = size;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " cost : " + cost + " size : " + size;
	}
	
	@Override
	public int compareTo(Shoes o) {
		
		return this.cost-o.cost;
		// return this.size-o.size
	}
	
	
	
	
}
