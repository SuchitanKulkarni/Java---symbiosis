package com.java.symboisis.constructor;

public class Constructor_4_Chaning extends Constructor_5_Chaining {
	
	Constructor_4_Chaning(){
		this(10);
		
		System.out.println("\nHello in implicite ");
	}
	Constructor_4_Chaning(int a){
		this("hello",10);
		
		System.out.println("\nHello in implicite " + a);
	}
	Constructor_4_Chaning(String a,int b){
		this(10,8.4f,"Hi");
		
		System.out.println("\nHello in implicite " + a + " " +b);
	}
	Constructor_4_Chaning(int c,float b,String s){
		
		super();
		
		System.out.println("\nHello in implicite " + c + " " + b+" "+ s);
	}
	
	public static void main(String[] args) {
		
		new Constructor_4_Chaning();
	}

}
