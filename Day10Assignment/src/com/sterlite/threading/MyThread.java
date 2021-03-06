/*
 * @author bhargav.bechara@stltech.in
 * @date 02-02-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Represent user-defined thread class
 */

package com.sterlite.threading;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Hi I am executed by thread " + Thread.currentThread().getName() + " Priority of Thread: " + Thread.currentThread().getPriority());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
