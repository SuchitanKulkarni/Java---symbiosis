package com.java.symboisis.multithreading;

public class Thread_2 extends Thread {
	
	@Override
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		
		Thread_2 t  = new Thread_2();
		
		Thread_2 t2 = new Thread_2();
		
		t.setName("computer");
		t2.setName("Entc");
		
		t2.start();
		t.start();
	}

}
