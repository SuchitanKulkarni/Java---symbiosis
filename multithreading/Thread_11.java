package com.java.symboisis.multithreading;

public class Thread_11 extends Thread{
	
	public void run() {
		
		for(int i=0;i<5;i++) {
				
			System.out.println(i);
				
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	}
	
	public static void main(String[] args) {
		
		Thread_11 t1 = new Thread_11();
		
		t1.start();
		t1.interrupt();
		
		
	}

}
