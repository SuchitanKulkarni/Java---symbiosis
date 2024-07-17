package com.java.symboisis.exceptionalhandleing;

public class ExH_6 {
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("this is arrayindexout of bound exception");
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("nullpointer");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("arithmatic");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("super class");
		}
		
	}
}
