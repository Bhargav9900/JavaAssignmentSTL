/*
 * @author bhargav.bechara@stltech.in
 * @date 27-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Account class
 */
package com.sterlite.accounts;

import com.sterlite.exception.InsufficientBalanceException;

public class Account {

	private int accNo;
	private String ownerName;
	private double balance;
	
	public Account() {
		accNo = 169;
		ownerName = "Bhargav";
		balance = 56700.87;
	}

	public Account(int accNo, String ownerName, double balance) {
		//super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}
	
	public void printDetails() {
		System.out.println("Account Number: " + accNo+ "\t Name: "+ownerName+ "\t Balance: "+balance);
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException
	{
		if(amount > balance || balance < 1000) {
			throw new InsufficientBalanceException("Withdraw amount is greater than Balance");
		}
		else {
			balance = balance - amount;
			System.out.println("Current balance: "+balance+" Rs.");
		}
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Current balance: "+balance+" Rs.");
	}
	
}
