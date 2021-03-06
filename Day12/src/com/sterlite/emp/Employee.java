/*
 * @author bhargav.bechara@stltech.in
 * @date 04-02-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Demonstrate employee entity
 */

package com.sterlite.emp;

import java.io.Serializable;

import com.sterlite.dates.MyDate;

public class Employee implements Serializable{

	private transient int empId;//empId not serialized due to 
	private String name;
	private double salary;
	private transient MyDate birthDate;
	
	public Employee() {
		empId = 1699;
		name = "Bhargav";
		salary = 67000.00;
		birthDate = new MyDate();
		System.out.println("Default constructor of Employee");
	}
	
	public Employee(int empId, String name, double salary, MyDate birthDate) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.birthDate = birthDate;
	}

	public void display() {
		System.out.println("Empid: " + empId +
							"Name: " + name +
							"Salary: " + salary +
							"birthday: " + birthDate);
	}
	
	
	
	
}
