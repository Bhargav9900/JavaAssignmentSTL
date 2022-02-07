
/*
 * @author bhargav.bechara@stltech.in
 * @date 24-01-2021 12.22 am
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Represent wage-employee entity of any orgnization.
 * 				It is super class of all other types of employee
 */

package com.sterlite.inheritance.rmp;

public class WageEmployee extends Employee {
	
	private int hours;
	private float ratePerHour;
	
	public WageEmployee() {
		super();
		System.out.println("default of wage emp");
	}
	public WageEmployee(int empId, String name, double salary,int hours,float ratePerHour) {
		super(empId, name, salary);
		this.hours = hours;
		this.ratePerHour = ratePerHour;
		System.out.println("parameter of wage emp");
		// TODO Auto-generated constructor stub
	}
	
	public void calculateWage() {
		float wage = hours * ratePerHour;
		System.out.println("Wage: " + wage);
	}
	
	public void display() {
		
		System.out.println("hourse: "+hours+" rate: "+ratePerHour);
		super.display();
	}
	
	
}
