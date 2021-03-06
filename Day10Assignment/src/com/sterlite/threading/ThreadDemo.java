/*
 * @author bhargav.bechara@stltech.in
 * @date 02-02-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Represent thread Demo
 */
package com.sterlite.threading;

public class ThreadDemo {

	//main method is executed by "main" thread
	//main method is push into thread main call stack
	public static void main(String[] args) {
	
		//getting name and priority of main
		System.out.println("Main thread name: " + Thread.currentThread().getName() + " Priority of main: " + Thread.currentThread().getPriority());
		
		//Creating user define thread
		//born or new state of user-defined thread
		Thread t1 = new MyThread(); // creating first thread(user-define)
		Thread t2 = new MyThread();
		Thread t3 = new MyThread();

		//moving t1 and t2 thread from born to runnable state
		t1.setName("Bhargav");
		t2.setName("Vasu");
		t3.setName("Neer");
		
		t1.setPriority(7);
		t3.setPriority(3);
		t2.setPriority(9);
		
		t1.start(); // separate call stack is generated for t1 thread
		t2.start(); // separate call stack is generated for t2 thread
		t3.start();
		
	}

}
