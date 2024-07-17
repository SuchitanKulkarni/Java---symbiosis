package com.java.symboisis.inheritance;

public class Flower {
	
	public void fragarance() {
		
		System.out.println("\nthe Fragrance");
	}
	
	public static void main(String[] args) {
		
		//Lotus l = new Lotus();
		
	Rose r = new Rose();
	r.fragarance();
		Rose.branch();
		
		Lotus.branch();
		
		//Rose r = new Rose();
		
		r.fragarance();
		r.branch();
	}

}
