package com.java.symboisis.test;

import java.util.Scanner;


/* 
 * "==" it is used to compair two numeric values by variable but in case of string it is use to compair one variable and 
 * one value.
 * the equals() methode is used to compair two strings by their variable. 
 */



public class Circle {
	
	private float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public float Area() {
		
		float area = (float) (3.14*radius*radius);
		return area;
		
	}
	
	public float Perimeter() {
		
		float peri = (float) (2*3.14*radius);
		
		return peri;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r;
		
		System.out.println("\n Enter the radius of circle : ");
		r = sc.nextInt();
		
		Circle c = new Circle();
		
		c.setRadius(r);
		
		System.out.println("\n Radius : "+c.getRadius());
		
		
		System.out.println("\n Area of circle : " + c.Area());
		System.out.println("\n Perimeter of circle : " +c.Perimeter());
	}

}
