package com.java.symboisis.multithreading;



public class Thread_4 extends Thread {
	
	@Override
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()); 		//thread task
		Thread.currentThread().setName("Anv - main converted");
		System.out.println(Thread.currentThread().getName()); 
		
		Thread_4 n = new Thread_4();
		
		n.setName("HIEEEEE - new thread-class");
		
		n.start();
		
		//n.start();
		
		
		
	}
	

}
