/*
 * @author bhargav.bechara@stltech.in
 * @date 17-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description This is first assignment
 * 				This is simple java class which represent date entity in real world
 */
public class date {
	
}

class MyDate{
	
	
	private int day;
	private int month;
	private int year;
	
	MyDate()
	{
		day= 17 ;
		month = 1;
		year  = 2022;
	}
	public void initDate()
	{
		day= 9 ;
		month = 9;
		year  = 2000;
	}
	
	public void printDate()
	{
		System.out.println("Birthday: "+day+"/"+month+"/"+year);
		System.out.println("hello");
	}
}
