package com.java.symboisis.inheritance;

public class Iphone_13 extends Mobile_Iphone{
	
	public void camera() {
		
		System.out.println("\ncamera has 138mp");
	}
	public void security() {
		
		System.out.println("\nSecurity have end-to-end encryption");
	}
	
	public static void main(String[] args) {
		
		Iphone_15 p = new Iphone_15();
		
		p.security();
		p.camera();
		p.OS();
		p.call();
		p.album();
	}

}
