package com.sterlite.threading;

public class RunnableLambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable re = ()->{
			
			try {
				for(int i=0;i<5;i++) {
				System.out.println("Running");
				Thread.sleep(500);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		};
		
		Thread t1 = new Thread(re);
		t1.start();
		
		Thread t2 = new Thread(re);
		t2.start();
	}

}
