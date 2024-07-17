package com.java.symboisis.multithreading;

public class Thread_8 extends Thread{
	
	
	@Override
	
	public void run() {
		
		Thread.currentThread().setPriority(MIN_PRIORITY);
		
		Thread.currentThread().setName("Bhoomi");
		
		System.out.println(Thread.currentThread().isDaemon());
		
		for(int i=0;i<5;i++) {
			
			System.out.println(i +" "+ Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread_8 r = new Thread_8();
		
		Thread.currentThread().setName("Rishika");
		
		r.setDaemon(true);
		
		r.start();
		
		Thread.currentThread().setPriority(MAX_PRIORITY);
		
		for(int i=0;i<5;i++) {
			
			
			
			System.out.println(i + " " + Thread.currentThread().getName());
			r.sleep(2000);
		}
	}

}
