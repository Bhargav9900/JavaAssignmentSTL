/*
 * @author bhargav.bechara@stltech.in
 * @date 21-01-2021 11:11 am
 * @version 4.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Represent employee entity and demonstrate containment
 */
package com.sterlite.containment.emps;

import com.sterlite.containment.dates.MyDate;

public class Employee {

	private int empId;
	private String name;
	private double salary;
	
	//contained object ref
	private MyDate birthDate;

	public Employee() {
		empId = 1699;
		name = "Bhargav";
		salary = 33000;
		//contained obj
		birthDate = new MyDate();
		
		System.out.println("default constructor of Emp class");
	}

	public Employee(int empId, String name, double salary, MyDate birthDate) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.birthDate = birthDate;
		System.out.println("Parameterized constructor of Emp class");
	}
	
	public void display() {
		
		System.out.println("EmpId: " + empId +
							"\tName: " + name+
							"\tSalary: " + salary+
							"\tDOB: " + birthDate);
	}
	
	
	
	
}
