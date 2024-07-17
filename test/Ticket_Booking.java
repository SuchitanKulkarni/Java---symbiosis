package com.java.symboisis.test;

import java.util.Scanner;

public class Ticket_Booking {
	
	public int cost(int distance) {
		
		if(distance <600) {
			
			return distance*2;
		}
		if(distance >=600 && distance<=1500) {
			
			return distance*4;
		}
		else {
			return distance*6;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("\n------------Ticket BOOKing-----------");
		
		int ch,b,a;
		
		String deString;
		String sourceString;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter the Source : ");
		sourceString = sc.next();
		System.out.println("\n ENter the Destiation : ");
		deString = sc.next();
		
		int mile;
		System.out.println("\n Enter the Distance : ");
		mile = sc.nextInt();
		
		Ticket_Booking iBooking = new Ticket_Booking();
		
		int dis = iBooking.cost(mile); 
		
		System.out.println("\npress\n 1.Bus\n 2.Train\n 3.plane");
		System.out.println("\nEnter Your choice : ");
		ch = sc.nextInt();
		
		
		
		switch(ch) {
		
		case 1 : 
					System.out.println("\n press\n1.AC And Sleeper\n2.Non-AC And Sleeper\n3.AC and Seater\n4.Non-AC Andm Seater");
					System.out.println("\nEnter your choice : ");
					 a = sc.nextInt();
					
					switch(a) {
					
					case 1: System.out.println("\npress\n1.Day\n2.Evening\n3.Night");
							System.out.println("\nEnter your choice : ");
							 b = sc.nextInt();
							
							switch(b) {
							
							case 1:
									System.out.println("Bus : Day : AC And Sleeper : Ticket price is " + dis + " "+ sourceString +" To " + deString);
									break;
							case 2:
								System.out.println("Bus : Evening : AC And Sleeper : Ticket price is " + dis+" "+ sourceString +" To " + deString);
								break;
							case 3:
								System.out.println("Bus : Night :  AC And Sleeper :Ticket price is "+ dis +" "+ sourceString +" To " + deString);
								
							default: System.out.println("wrong choice");
							}
							
							break;
					case 2 : 
						System.out.println("\npress\n1.Day\n2.Evening\n3.Night");
						System.out.println("\nEnter your choice : ");
						 b = sc.nextInt();
						
						switch(b) {
						
						case 1:
								System.out.println("Bus : Day : Non-AC And Sleeper : Ticket price is " + dis*2 +" "+ sourceString +" To " + deString);
								break;
						case 2:
							System.out.println("Bus : Evening: Non-AC And Sleeper : Ticket price is "+ dis*3 +" "+ sourceString +" To " + deString);
							break;
						case 3:
							System.out.println("Bus : Night : Non-AC And Sleeper : Ticket price is "+ dis +" "+ sourceString +" To " + deString);
							
						default: System.out.println("wrong choice");
						}
						
						break;
						
					case 3 :
						
						System.out.println("\npress\n1.Day\n2.Evening\n3.Night");
						System.out.println("\nEnter your choice : ");
						 b = sc.nextInt();
						
						switch(b) {
						
						case 1:
								System.out.println("Bus : Day : AC and Seater : Ticket price is "+ dis*1 +" "+ sourceString +" To " + deString);
								break;
						case 2:
							System.out.println("Bus : Evening : AC and Seater : Ticket price is "+ dis*2 +" "+ sourceString +" To " + deString);
							break;
						case 3:
							System.out.println("Bus : Night : AC and Seater : Ticket price is "+ dis*3 +"  "+ sourceString +" To " + deString);
							
						default: System.out.println("wrong choice");
						}
						
					break;
					
					case 4:
						System.out.println("\npress\n1.Day\n2.Evening\n3.Night");
						System.out.println("\nEnter your choice : ");
						 b = sc.nextInt();
						
						switch(b) {
						
						case 1:
								System.out.println("Bus : Day : Non-AC Andm Seater : Ticket price is " + dis/2 +"  "+ sourceString +" To " + deString);
								break;
						case 2:
							System.out.println("Bus : Evening : Non-AC Andm Seater : Ticket price is "+ dis/3 +" "+ sourceString +" To " + deString);
							break;
						case 3:
							System.out.println("Bus : Night : Non-AC Andm Seater : Ticket price is "+ dis/1 +" "+ sourceString +" To " + deString);
							
						default: System.out.println("wrong choice");
						}
						
						break;
					default : System.out.println("Wrong choice");	
					
					}
					
					break;
					
		case 2 : 
			System.out.println("\n press\n1.AC And Sleeper\n2.Non-AC And Sleeper\n3.AC and Seater\n4.Non-AC Andm Seater");
			System.out.println("\nEnter your choice : ");
			 a = sc.nextInt();
			
			switch(a) {
			
			case 1: System.out.println("\npress\n1.Day\n2.Evening\n3.Night");
					System.out.println("\nEnter your choice : ");
					 b = sc.nextInt();
					
					switch(b) {
					
					case 1:
							System.out.println("Train : Day : AC And Sleeper : Ticket price is " + dis*2 +" "+ sourceString +" To " + deString);
							break;
					case 2:
						System.out.println("Train : Evening : AC And Sleeper : Ticket price is "+ dis*3 +" "+ sourceString +" To " + deString);
						break;
					case 3:
						System.out.println("Train : Night : AC And Sleeper :Ticket price is " + dis*4 +" "+ sourceString +" To " + deString);
						break;
					default: System.out.println("wrong choice");
					}
					
					break;
			case 2 : 
				System.out.println("\npress\n1.Day\n2.Evening\n3.Night");
				System.out.println("\nEnter your choice : ");
				 b = sc.nextInt();
				
				switch(b) {
				
				case 1:
						System.out.println("Train : Day : Non-AC And Sleeper : Ticket price is "+ dis*1 +" "+ sourceString +" To " + deString);
						break;
				case 2:
					System.out.println("Train : Evening :  Non-AC And Sleeper : Ticket price is "+ dis*2 +" "+ sourceString +" To " + deString);
					break;
				case 3:
					System.out.println("Train : Night : Non-AC And Sleeper : Ticket price is "+ dis*3 +" "+ sourceString +" To " + deString);
					break;
				default: System.out.println("wrong choice");
				}
				
				break;
				
			case 3 :
				
				System.out.println("\npress\n1.Day\n2.Evening\n3.Night");
				System.out.println("\nEnter your choice : ");
				 b = sc.nextInt();
				
				switch(b) {
				
				case 1:
						System.out.println("Train : Day : AC and Seater : Ticket price is "+ dis*1 +" "+ sourceString +" To " + deString);
						break;
				case 2:
					System.out.println("Train : Evening :  AC and Seater : Ticket price is "+ dis*2 +" "+ sourceString +" To " + deString);
					break;
				case 3:
					System.out.println("Train : Night :  AC and Seater : Ticket price is " + dis*3 +" "+ sourceString +" To " + deString);
					break;
					
				default: System.out.println("wrong choice");
				}
				
			break;
			
			case 4:
				System.out.println("\npress\n1.Day\n2.Evening\n3.Night");
				System.out.println("\nEnter your choice : ");
				 b = sc.nextInt();
				
				switch(b) {
				
				case 1:
						System.out.println("Train : Day : Non-AC Andm Seater : Ticket price is "+ dis*1 +" "+ sourceString +" To " + deString);
						break;
				case 2:
					System.out.println("Train : Evening :  Non-AC Andm Seater : Ticket price is "+ dis*3 +" "+ sourceString +" To " + deString);
					break;
				case 3:
					System.out.println("Train : Night : Non-AC Andm Seater : Ticket price is "+ dis*2 +" "+ sourceString +" To " + deString);
					
				default: System.out.println("wrong choice");
				}
				
				break;
			default : System.out.println("Wrong choice");	
			}
			
					break;
			
	   case 3:
		   System.out.println("\n press\n1.Economy\n2.Premium Economy\n3.Business class\n4.First Class");
			System.out.println("\nEnter your choice : ");
			 a = sc.nextInt();
			
			switch(a) {
			
			case 1: System.out.println("\npress\n1.Day\n2.Evening\n3.Night");
					System.out.println("\nEnter your choice : ");
					 b = sc.nextInt();
					
					switch(b) {
					
					case 1:
							System.out.println("Plane : Day : Economy : Ticket price is "+ dis*10 +" "+ sourceString +" To " + deString);
							break;
					case 2:
						System.out.println("Plane : Evening : Economy : Ticket price is "+ dis*20 +" "+ sourceString +" To " + deString);
						break;
					case 3:
						System.out.println("Plane : Night : Economy :Ticket price is "+ dis*30 +" "+ sourceString +" To " + deString);
						
					default: System.out.println("wrong choice");
					}
					
					break;
			case 2 : 
				System.out.println("\npress\n1.Day\n2.Evening\n3.Night");
				System.out.println("\nEnter your choice : ");
				 b = sc.nextInt();
				
				switch(b) {
				
				case 1:
						System.out.println("Plane : Day : Premium Economy : Ticket price is "+ dis*20 +" "+ sourceString +" To " + deString);
						break;
				case 2:
					System.out.println("Plane : Evening :  Premium Economy : Ticket price is "+ dis*40 +" "+ sourceString +" To " + deString);
					break;
				case 3:
					System.out.println("Plane : Night : Premium Economy : Ticket price is "+ dis*30 +" "+ sourceString +" To " + deString);
					
				default: System.out.println("wrong choice");
				}
				
				break;
				
			case 3 :
				
				System.out.println("\npress\n1.Day\n2.Evening\n3.Night");
				System.out.println("\nEnter your choice : ");
				 b = sc.nextInt();
				
				switch(b) {
				
				case 1:
						System.out.println("Plane : Day : Business class : Ticket price is "+ dis*12 +" "+ sourceString +" To " + deString);
						break;
				case 2:
					System.out.println("Plane : Evening :  Business class : Ticket price is "+ dis*15 +" "+ sourceString +" To " + deString);
					break;
				case 3:
					System.out.println("Plane : Night :  Business class : Ticket price is "+ dis*21 +" "+ sourceString +" To " + deString);
					
				default: System.out.println("wrong choice");
				}
				
			break;
			
			case 4:
				System.out.println("\npress\n1.Day\n2.Evening\n3.Night");
				System.out.println("\nEnter your choice : ");
				 b = sc.nextInt();
				
				switch(b) {
				
				case 1:
						System.out.println("Plane : Day : First Class : Ticket price is "+ dis*13 +" "+ sourceString +" To " + deString);
						break;
				case 2: 
					System.out.println("Plane : Evening : First Class : Ticket price is "+ dis*14 +" "+ sourceString +" To " + deString);
					break;
				case 3:
					System.out.println("Plane : Night : First Class : Ticket price is "+ dis*15 +" "+ sourceString +" To " + deString);
					
				default: System.out.println("wrong choice");
				}
				
				break;
			default : System.out.println("Wrong choice");
			}
			
			break;
			
			default : System.out.println("Wrong choice");
				
			
}
		}
	}


