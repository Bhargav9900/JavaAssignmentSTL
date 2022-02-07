package com.sterlite.bank;

import com.sterlite.account.Account;
import com.sterlite.threading.AccountThread;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account(1611,"Mr and Mrs Khiladi",20000.00);
		
		Thread husbandThread = new AccountThread(acc,7000.00,false);
		Thread wifeThread = new AccountThread(acc,9000.00,true);
		
		husbandThread.setName("Mr Khiladi");
		wifeThread.setName("Mrs. Khiladi");
		
		husbandThread.start();
		wifeThread.start();
		
		
	}

}
