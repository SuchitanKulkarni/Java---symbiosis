package com.java.symboisis.basic;

import java.util.Iterator;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(int i=3;i>0;i--) {
			
			for(int j=i;j<=3;j++) {
				
				System.out.print("s");
			}
			
			System.out.print("\n");
		}
		
		
*/
		
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
