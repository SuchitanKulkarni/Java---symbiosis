package com.java.symboisis.test;

public class Reverse {
	
	public static void main(String[] args) {
		
		String s = "Hello";
		
		
		int j = s.length()-1;
		
		char [] c = new char[s.length()];
		
		for(int i=0;i<s.length();i++) {
			
			c[i] = s.charAt(i);
		}
		
		int i = 0;
		
		while(i<=j) {
			
			char ch = c[i];
			c[i] = c[j];
			c[j] = ch;
			
			i++;
			j--;
		}
		
		String s1 = new String(c);
		
		System.out.println(s1);
		
	}

}
