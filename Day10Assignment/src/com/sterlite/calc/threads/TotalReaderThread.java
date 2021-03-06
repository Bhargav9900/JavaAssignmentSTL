package com.sterlite.calc.threads;

import com.sterlite.calc.Data;

public class TotalReaderThread extends Thread {

	private Data data;

	public TotalReaderThread(Data data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
		System.out.println("wating for reading total");
		synchronized (data) {
			try {
				data.wait(3000);
				int total = data.getTotal();
				System.out.println("Total is " + total);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
