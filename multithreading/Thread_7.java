package com.java.symboisis.multithreading;

public class Thread_7 extends Thread {
	
	public void run() {
		
		Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("child");
	}
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(MAX_PRIORITY);
		
		System.out.println(Thread.currentThread().getPriority());
		
		Thread_7 t7 = new Thread_7();
		
		t7.start();
	}

}
