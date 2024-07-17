package com.java.symboisis.basic;

public class Conditional_Statement_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n press :\n1.Monday \n2.Tuesday\n3.Wedsenday\n4.Thrusday\n5.Friday\n6.Saturday\n7.Sunday");
		
		int day = 1;
		
		switch(day) {
		
		case 1: System.out.println("\n-----------------Monday_Dishes----------------\n");
				System.out.println("\n1.Idali\n2.Dosa\n3.uttapam\n4.Rice\n5.samabar\n6.Puliyorage");
				break;
				
		case 2: System.out.println("\n-----------------Tuesday_Dishes----------------\n");
				System.out.println("\n1.paneer masala\n2.naan\n3.Dal_rice\n4.Puri_bhaji\n5.makke_di_roti\n6.paneer butter masala");
				break;
				
		case 3: System.out.println("\n-----------------Wedsenday_Dishes----------------\n");
				System.out.println("\n1.Pani puri\n2.Bhel\n3.Masala papad\n4.Dabeli\n5.Samosa\n6.pav Bhaji");
				break;
				
		case 4: System.out.println("\n-----------------Thrusday_Dishes----------------\n");
				System.out.println("\n1.Pizza\n2.Burger\n3.Coffee\n4.Boba tea\n5.Fries\n6.Gralic bread");
				break;
				
		case 5: System.out.println("\n-----------------Friday_Dishes----------------\n");
				System.out.println("\n1.bhakari\n2.chapati\n3.rice\n4.dal\n5.paneer masala");
				break;
				
		case 6: System.out.println("\n-----------------Saturday_Dishes----------------\n");
				System.out.println("\n1.maggi\n2.noodles\n3.manchurian\n4.chaines bhel\n5.sweet potato\n6.paneer manchuri");
				break;
				
		case 7: System.out.println("\n-----------------Sunday_Dishes----------------\n");
				System.out.println("\n1.mango\n2.Apple\n3.Banana\n4.Kiwi\n5.avacado\n6.watermelon");
				break;
				
		default:
				System.out.println("\n Invalid chosen");
				
		
		}
		
		
	}

}
