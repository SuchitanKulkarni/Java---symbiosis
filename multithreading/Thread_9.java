package com.java.symboisis.multithreading;

public class Thread_9 extends Thread{
	
@Override
	
	public void run() 
{
	System.out.println(Thread.currentThread().isDaemon());
	
		
		
		for(int i=0;i<5;i++) 
		{
			
	
			System.out.println(i +" "+ Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) 
	{
		System.out.println("\nhello");	
		
		Thread_9 t1 = new Thread_9();
		t1.setDaemon(true);
		t1.setName("_RUN_1");
		t1.start();
		
		
		Thread_9 t2 = new Thread_9();
		t2.setDaemon(false);
		t2.setName("_RUN_2");
		t2.start();
	}

}
