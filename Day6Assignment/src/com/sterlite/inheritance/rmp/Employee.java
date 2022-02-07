/*
 * @author bhargav.bechara@stltech.in
 * @date 24-01-2021 10.33 am
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Represent employee entity of any orgnization.
 * 				It is super class of all other types of employee
 */

package com.sterlite.inheritance.rmp;

public class Employee {
	
	
	protected int empId;
	protected String name;
	protected double salary;
	
	public Employee() {
		empId = 100;
		name = "Bhargav";
		salary = 45000.00;
		System.out.println("default con of employee");
	}
	
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		System.out.println("para of emp");
	}

	public void display() {
		System.out.println("EmpID: "+empId+
							"\tName: "+name+
							"\tSlary: "+salary);
	}

}
