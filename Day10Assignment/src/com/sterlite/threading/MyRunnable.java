package com.sterlite.threading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			for(int i=0;i<5;i++) {
				System.out.println("Thread executed by Runnable Interface" + Thread.currentThread().getName() + " Priority of Thread: " + Thread.currentThread().getPriority());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
