package com.java.symboisis.constructor;

public class Constructor_3_Chaining {
	
	Constructor_3_Chaining(){
		
		this(10);
		System.out.println("\nThis is constructor");
	}
	
	Constructor_3_Chaining(int a){
		this("Hello",10);
		
		System.out.println("\n Next : " + a);
	}
	Constructor_3_Chaining(String a,int b){
		System.out.println(a + " " + b);
	}
	
	public static void main(String[] args) {
		
		new Constructor_3_Chaining();
	}

}
