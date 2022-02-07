/*
 * @author bhargav.bechara@stltech.in
 * @date 24-01-2021 4.23 pm
 * @version 2.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Manager is subclass for employee
 */
package inheritance.emp.mgr;

import inheritance.emp.Employee;

public class Manager extends Employee {
	
	private double incentives;

	public Manager() {
		super();
		incentives = 9900.00;
		System.out.println("Default constructor of Manager");
	}

	public Manager(int empId, String name, double salary, double incentives) {
		super(empId, name, salary);//invoking super class constructor
		this.incentives = incentives;
		System.out.println("Parameterized constructor of Manager");
	}

	
	public void showIncentives() {
		System.out.println("Incentives: " + incentives);
	}
	
	public void display() {
		System.out.println("Display method of manager class");
		super.display();
		System.out.print("Incentives using display method: "+incentives);
	}
	
	public String toString() {
		return super.toString() + " Incentives:= " + incentives;
	}

}
