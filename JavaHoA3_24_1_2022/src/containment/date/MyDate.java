/*
 * @author bhargav.bechara@stltech.in
 * @date 24-01-2021 04:05 pm
 * @version 5.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Mydate class for containment
 */
package containment.date;

public class MyDate {
	
	//instance variable
	private int day;
	private int month;
	private int year;
	
	public MyDate() {
		day = month = 9;
		year = 2000;
		System.out.println("default constructor of MyDate called");
	}
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void printDate() {
		System.out.println("Date: "+day+"/"+month+"/"+year);
	}
	
	public String toString() {
		return  day + "-" + month + "-" + year;
	}

}
