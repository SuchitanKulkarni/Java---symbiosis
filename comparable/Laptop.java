package com.java.symboisis.comparable;

public class Laptop implements Comparable<Laptop>{
	
	Float rating;
	double price;
	String brandname;
	public Laptop(float rating,double price,String brandname) {
		super();
		
		this.rating=rating;
		this.price=price;
		this.brandname=brandname;
		
	}
	@Override
	public String toString() {
		return "Laptop [rating=" + rating + ", price=" + price + ", brandname=" + brandname + "]";
	}
	@Override
	public int compareTo(Laptop o) {
		// TODO Auto-generated method stub
		return this.rating.compareTo(o.rating);
	}
	
	
	
	

}
