/*
 * @author bhargav.bechara@stltech.in
 * @date 27-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Bank class
 */
package com.sterlite.bank;

import com.sterlite.accounts.Account;
import com.sterlite.exception.InsufficientBalanceException;

public class BankMain {

	public static void main(String[] args) {
		
		Account ac = new Account(1699,"Bhargav Bechara",45000.00);
		
		ac.printDetails();
		System.out.println();
		
		try {			
			ac.withdraw(55000.00);
		}
		catch(InsufficientBalanceException e) {
			//System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("After deposit money into account\n");
		ac.deposit(20000.00);
		
		
		try {			
			ac.withdraw(55000.00);
		}
		catch(InsufficientBalanceException e) {
			//System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println();
		ac.printDetails();
	}

}
