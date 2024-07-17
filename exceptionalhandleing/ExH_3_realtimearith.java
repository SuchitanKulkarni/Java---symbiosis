package com.java.symboisis.exceptionalhandleing;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExH_3_realtimearith {
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		BigDecimal c1 = new BigDecimal(11);
		BigDecimal c2 = new BigDecimal(17);
		
		try {
			System.out.println(c1.divide(c2));
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println("\n dont divide the big decimal to small decimal");
		}
		
		
	}

}
