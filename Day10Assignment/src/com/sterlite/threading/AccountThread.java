/*
 * @author bhargav.bechara@stltech.in
 * @date 02-02-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Represent Account thread
 */
package com.sterlite.threading;

import com.sterlite.account.Account;

public class AccountThread extends Thread {

	private Account acc;
	private double amount;
	private boolean flag;
	
	public AccountThread(Account acc, double amount, boolean flag) {
		super();
		this.acc = acc;
		this.amount = amount;
		this.flag = flag;
	}

	@Override
	public void run() {
		
		try {
			if(flag == true) {
				acc.withdraw(amount);
			}
			else {
				acc.withdraw(amount);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
