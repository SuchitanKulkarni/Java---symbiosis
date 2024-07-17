package com.java.symboisis.multithreading;

public class Thread_10 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		
//			Thread.yield();
			for(int i=1; i<=3; i++)
			{
				System.out.println(i+" "+Thread.currentThread().getName());
			}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread.yield();
		Thread_10 c= new Thread_10();
		Thread t = new Thread(c);
		t.setName("Anv");
		t.start();
		for(int i=1; i<=3; i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}

}
