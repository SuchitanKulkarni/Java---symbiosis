package com.java.symboisis.multithreading;

public class Thread_6 extends Thread{
	
	@Override
	
	public void run() {
		System.out.println(	Thread.currentThread().isDaemon());
		System.out.println("Deamon");
	}
	
	public static void main(String[] args) {
		Thread_6 t = new Thread_6();
		
		System.out.println("Deamon - thread - executing");
		
		t.setDaemon(true);
		
		t.start();
	}

}
