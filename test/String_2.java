package com.java.symboisis.test;

public class String_2 extends String_1{
	
	public void display() {
		
		System.out.println("display in child");
	}
	public static void main(String[] args) {
		
		String_2 s2 = new String_2();
		
		s2.show();
	}

}
