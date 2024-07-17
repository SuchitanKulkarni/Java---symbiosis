package com.java.symboisis.polymorphism;

public class Poly_whatsapp_4 extends Poly_whatsapp_3{
	
	public void status() {
	
		super.status();
		
		System.out.println("\ninclude video and image");
	}
	
	public static void main(String[] args) {
		
		Poly_whatsapp_4 p = new Poly_whatsapp_4();
		
		p.display();
		p.calling();
		p.status();
	}

}
