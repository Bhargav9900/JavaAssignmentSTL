/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description static method block and variable
 */
public class Account {

	
	private int accNo;
	private String ownerName;
	private double balance;
	private float durationYear;
	
	private static float interestRate;
	private static int count;
	
	static {
		interestRate = 0.05f;
	}
	
	public Account() {
		accNo = 11961;
		ownerName = "Bhargav";
		balance = 2345000;
		durationYear = 7.5f;
		count++;
	}
	
	public Account(int accNo, String ownerName, double balance, float years) {
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
		durationYear = years;
		count++;
	}
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setDuration(float years) {
		durationYear = years;
	}
	
	public float getDuration() {
		return durationYear;
	}
	
	public void setInterest(float rate) {
		interestRate = rate;
	}
	
	public float getInterest() {
		return interestRate;
	}
	
	public static int getCount()
	{
		return count;
	}
	
	public void calculateInterest()
	{
		double si = balance*durationYear*interestRate;
		System.out.println("Simple Interest= "+si);
	}
	
	public void printDetalis() {
		
		System.out.println("Account Number: "+accNo);
		System.out.println("Account Holder Name: "+ownerName);
		System.out.println("Account Balance: "+balance);
		System.out.println("Time: "+durationYear+" year(s)");
	}
}
