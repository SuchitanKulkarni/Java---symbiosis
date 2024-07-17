package com.java.symboisis.constructor;

public class Constructor_5_Chaining {
	
	Constructor_5_Chaining (){
		
		this(10);
		
		System.err.println("\n In Explicit Constructor");
	}
	Constructor_5_Chaining (int a){
		this(12,6.5f);
		System.err.println("\n In Explicit Constructor " + a);
	}
	
	Constructor_5_Chaining (int a, float b){
		this(19,"Welcome");
		
		System.err.println("\n In Explicit Constructor " + a+" "+b);
	}
	
	Constructor_5_Chaining (int a,String b){
		
		System.err.println("\n In Explicit Constructor "+a+" "+b);
	}

}
