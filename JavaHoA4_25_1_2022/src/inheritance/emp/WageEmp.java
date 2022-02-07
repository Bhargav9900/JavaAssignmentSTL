/*
 * @author bhargav.bechara@stltech.in
 * @date 24-01-2021 4:45 pm
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Represent wage-employee entity of any orgnization.
 * 				It is super class of all other types of employee
 */

package inheritance.emp;

public class WageEmp extends Employee {
	
	private int noOfHours;
	private float ratePerHour;
	
	public WageEmp() {
		super();
		noOfHours = 16;
		ratePerHour = 650.50f;
		System.out.println("Default construtor of WageEmp");
	}

	public WageEmp(int empId, String name, int hours, float rate) {
		super(empId, name);
		this.noOfHours = hours;
		this.ratePerHour = rate;
		System.out.println("Parameterized construtor of WageEmp");
		// TODO Auto-generated constructor stub
	}
	
	public void calculateWage() {
		float wage = noOfHours * ratePerHour;
		System.out.println("Wage: " + wage);
	}
	
	public void display() {
		System.out.println("Display method of WageEmp class");
		super.display();
		System.out.println("No of Hours: "+ noOfHours + " Rate: " + ratePerHour + " Rs. per hour" );
	} 
	
	public String toString() {
		return super.toString() + "No of Hours:= "+ noOfHours + " Rate:= " + ratePerHour + " Rs. per hour";
	}
	
	
	
	

}
