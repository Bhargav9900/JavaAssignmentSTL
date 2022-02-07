/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description static method block and variable
 */
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account();
		//display interest rate
		System.out.println("Interest Rate= "+ac.getInterest());
		
		System.out.println();
		//default constructor
		Account ac1 = new Account();
		ac1.printDetalis();
		System.out.println();
		
		//set individual value
		ac1.setAccNo(16119);
		ac1.setOwnerName("Bhargav Bechara");
		ac1.setBalance(121694);
		ac1.setDuration(10.7f);
		
		//print all individual value
		System.out.println("Account Number: "+ac1.getAccNo());
		System.out.println("Account Holder Name: "+ac1.getOwnerName());
		System.out.println("Account Balance: "+ac1.getBalance());
		System.out.println("Time: "+ac1.getDuration()+" year(s)");
		System.out.println();
		
		//parameterized constructor
		Account ac3 = new Account(119,"Bhargav D Bechara",654916.9,11.3f);
		ac3.printDetalis();
		System.out.println();
		//count
		System.out.println("Count");
		System.out.println(Account.getCount());

	}

}
