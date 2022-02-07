/*
 * @author bhargav.bechara@stltech.in
 * @date 24-01-2021 4.23 pm
 * @version 2.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Represent employee entity of any orgnization.
 * 				It is super class of all other types of employee
 */
package inheritance.emp;

public class Employee {

	private int empId;
	private String name;
	private double salary;
	
	
	public Employee() {
		empId = 1169;
		name = "Employee Test";
		salary = 23500.00;
		System.out.println("Deafault constructor of Employee");
	}


	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
		System.out.println("Two parameter constructor of Employee");
	}


	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		System.out.println("Three parameter constructor of Employee");
	}
	
	protected void display() {
		System.out.println("EmpID: "+empId+
				"\tName: "+name+
				"\tSlary: "+salary);
	}


	public String toString() {
		return "empId:=" + empId + " name:=" + name + " salary:=" + salary;
	}
	
	
	
	
	
	
}
