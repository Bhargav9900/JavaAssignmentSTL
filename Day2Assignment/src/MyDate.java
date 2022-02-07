/*
 * @author bhargav.bechara@stltech.in
 * @date 19-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description demonstration of constructor
 */
public class MyDate {

	private int day;//instance variable
	private int month;
	private int year;
	
	//explicit default or no-arg constructor
	MyDate(){
		
		//initializing variable
		day=1;
		month=1;
		year = 2022;
		System.out.println("no-arg counstructor called");
	}
	
	//parameterized constructor
	MyDate(int day,int month,int year){
		
		//initializing variable
			this(day,month);
			/*
			 * this.day=day; this.month = month;
			 */
		  this.year = year;
		 
		
		System.out.println("parameterized counstructor called");
	}
	
	MyDate(int day,int month){
		
		//initializing variable
		this.day=day;
		this.month = month;
		System.out.println("two parameterized counstructor called");
	}
	
	
	public void printDate() {
		System.out.println("Today is: "+day+"/"+month+"/"+year);
	}
}
