/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description demonstration of getter and setter method 
 */
public class MyDate {

	//data member
	private int day;//instance variable
	private int month;
	private int year;
	
	//static data 
	private static int count;
	
	//static init block
	static {
		count=0;
		System.out.println("static init block");
	}
	
	//instance init block
	{
		System.out.println("Instance init block 1");
	}
	
	MyDate(){
		day=month=1;
		year=2022;
		count++;
	}
	
	MyDate(int day,int month,int year){
		
		//initializing variable
		this.day=day; 
		this.month = month;
		this.year = year; 

	}
	
	{
		System.out.println("Instance init block 1");
	}
	
	public void setDay(int d) {
		day=d;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setMonth(int m) {
		month=m;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setYear(int y) {
		year=y;
	}
	
	public int getYear() {
		return year;
	}
	
	public void printDate() {
		System.out.println("Today is: "+day+"/"+month+"/"+year);
//		System.out.println("Count "+count);
	}
	
	public static int getCount()
	{
		return count;
	}
	
	static {
		System.out.println("static init block 2");
	}
	
	public String toString() {
		return day+"--"+month+"--"+year;
	}
}
