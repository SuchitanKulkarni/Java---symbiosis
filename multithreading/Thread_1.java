package com.java.symboisis.multithreading;

public class Thread_1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method");
	}
	
	
	public static void main(String[] args) {
		
		Thread_1 t = new Thread_1();
		
		Thread th = new Thread();
		
		th.start();
	}

}
