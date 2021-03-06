package com.sterlite.calc.threads;

import com.sterlite.calc.Data;

public class CalculatorThread extends Thread {

	private Data data;

	public CalculatorThread(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		
		synchronized (data) {
			try {
				int arr [] = data.getArr();
				int sum = 0;
				for(int ele : arr) {
					sum+=ele;
					System.out.println("Busy in calculating a sum");
					Thread.sleep(1000);
				}
				data.setTotal(sum);
				System.out.println("Total calculated...");
				data.notify();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}
