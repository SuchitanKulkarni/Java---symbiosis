package com.java.symboisis.test;

/*
 * inheritance is nothing but inheriting the property of parent to the child . in inheritance the following inheritances are support
 * by the java : 1. single level
 * 				 2. multi level
 * 				 3. heirarchical 
 * 				 4.hybrid
 * 
 * java does not support multiple inheritance because the ambiguity in the counstructor selection of the parent classes.
 */

public class String_1 {
	
	public void show() {
		System.out.println("This is parent");
	}
	
	public static void main(String[] args) {
		
		char [] p = {'p','e','o','p','l','e'};
		
		String s = new String(p);
		
	System.out.println(s);

}
}
