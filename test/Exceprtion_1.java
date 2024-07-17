package com.java.symboisis.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exceprtion_1 {
	
	public void  fileConnection(String a) throws FileNotFoundException {
		
		
			FileReader f = new FileReader(a);
			
			System.out.println(" \n connection done");
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		Exceprtion_1 e = new Exceprtion_1();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Enter the file path : ");
		
		String s  = sc.next(); 
		
		e.fileConnection(s);
		
	
	}
}
