package com.java.symboisis.multithreading;

public class Thread_3 extends Thread{
	
	@Override
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
	}
	
	public void run(int p) {
		
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		Thread_3 t1 = new Thread_3() ;
		Thread_5 t2 = new Thread_5() ;
		
		t1.setName("Thread-1");
		t2.setName("thread-2");
		
		t1.start();
		t2.start();
		
		
		
		
	}

}
