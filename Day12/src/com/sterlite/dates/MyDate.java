package com.sterlite.dates;

import java.io.Serializable;

//public class MyDate implements Serializable {
public class MyDate {

	private int day;
	private int month;
	private int year;
	
	public MyDate() {
		day = 4;
		month = 3;
		year = 2022;
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

	@Override
	public String toString() {
		return "day=" + day + ", month=" + month + ", year=" + year;
	}
	
	
	
	
}
