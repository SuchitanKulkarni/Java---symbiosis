package com.java.symboisis.basic;

public class practicePattern {
	public static void main(String[] args) {
		
		int i,j;
		
		for(i = 0;i<5;i++) {
			
			if(i%2==0) {
				
				for(j=0;j<5;j++) {
					System.out.print("*");
				}
			}
		   if(i==1) {
				
				for(j=0;j<3;j++) {
					
				}
				System.out.print("*");
				
			}
			if(i==3){
				for(j=0;j<=3;j++) {
					System.out.print(" ");
				}
				
				System.out.print("*");
				
				
				
			}
			
			System.out.println();
		}
		
		
		
	}
	

}
