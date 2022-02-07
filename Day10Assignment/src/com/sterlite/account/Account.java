/*
 * @author bhargav.bechara@stltech.in
 * @date 02-02-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Represent Account entity in a bank
 */
package com.sterlite.account;

public class Account {
	
	private int accNo;
	private String ownerName;
	private double balance;
	
	public Account() {
		
		accNo = 1699;
		ownerName = "Bhargav";
		balance = 10000.00;
	}

	public Account(int accNo, String ownerName, double balance) {
		//super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//state corruption
	//transaction method
	//public synchronized void withdraw(double amount) throws InterruptedException {
	public void withdraw(double amount) throws InterruptedException {
		
		synchronized (this) {
			double currBal = getBalance();
			System.out.println("Balance before withdrawal: " + currBal + " checked by: " + Thread.currentThread().getName());
			currBal = currBal - amount;
			
			Thread.sleep(1000);
			setBalance(currBal);
			currBal = getBalance();
			System.out.println("Balance after withdrawal: " + currBal  + " checked by: " + Thread.currentThread().getName());
			Thread.sleep(1000);
		}
		
	}
	
	
	
	

}
