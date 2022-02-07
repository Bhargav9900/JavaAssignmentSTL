/*
 * @author bhargav.bechara@stltech.in
 * @date 24-01-2021 10.33 am
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Represent manager entity of any orgnization.
 * 				It is sub class of employee
 */
package com.sterlite.inheritance.rmp.mgrs;

import com.sterlite.inheritance.rmp.Employee;

public class Manager extends Employee{

	private float incentives;
	
	public Manager() {
		incentives = 2000.00f;
		empId = 23;
		System.out.println("Default con of Manager");
	}

	public Manager(int empId,String name,double salary,float incentives) {
		super(empId,name,salary);//invoking super class constructor
		this.incentives = incentives;
		System.out.println("para of manager");
	}
	
	public void showIncentive() {
		System.out.println("Intencevie:" + incentives);
	}
	
	//overriding display method of super class
	public void display() {
		
		super.display();
		System.out.print("\tIncentive in mang: "+incentives);
	}
}
