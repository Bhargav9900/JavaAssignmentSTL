package com.sterlite.threading;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable target1 = new MyRunnable();
		Runnable target2 = new MyRunnable();
		
		// Creating threads and aligning each thread worker with runnable
		
		Thread t1 = new Thread(target1);
		Thread t3 = new Thread(target1);
		Thread t5 = new Thread(target1);
		
		
		Thread t2 = new Thread(target2);
		Thread t4 = new Thread(target2);
		
		t1.setName("Seeta");
		t2.setName("Geeta");
		t3.setName("Meeta");
		t4.setName("Babeeta");
		t5.setName("Neeta");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
