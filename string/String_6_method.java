package com.java.symboisis.string;

public class String_6_method {
	
	public static void main(String[] args) {
		
		String s1 = "heLlo";
		
		System.out.println(s1.isEmpty());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.endsWith("o"));
		System.out.println(s1.substring(1,4));
		System.out.println(s1.charAt(4));
		System.out.println(s1.contains("e"));
		System.out.println(s1.equalsIgnoreCase(s1));
		System.out.println(s1.concat("soft"));
		System.out.println(s1.indexOf(6));
		System.out.println(s1.lastIndexOf(3));
		
	
		
		
	}

}
