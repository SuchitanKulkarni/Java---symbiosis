package com.java.symboisis.test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Second_shortest_element {
	public static void main(String[] args) {
		
		int [] a = {3,5,7,89,1,5,8,2,9,2,9,0};
		
		Arrays.sort(a);
		
		System.out.println("\n Smallest second element : " + a[1]);
	}
}
