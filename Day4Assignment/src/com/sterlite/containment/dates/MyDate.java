package com.sterlite.containment.dates;

/*
 * @author bhargav.bechara@stltech.in
 * @date 21-01-2021 11:11 am
 * @version 4.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Mydate class for co
 */

public class MyDate {

	
		//data member
		private int day;//instance variable
		private int month;
		private int year;
		
		public MyDate() {
			day = month = 1;
			year = 2022;
			System.out.println("default constructor of MyDate");
		}

		public MyDate(int day, int month, int year) {
			//super();
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

		@Override
		public String toString() {
			return  day + "-" + month + "-" + year;
		}

		
		
}
