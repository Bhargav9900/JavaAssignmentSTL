/*
 * @author bhargav.bechara@stltech.in
 * @date 24-01-2021 04:11 am
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Represent employee entity and demonstrate containment
 */
package containment.emp;

import containment.date.MyDate;

public class Employee {

	private int empId;
	private String name;
	private MyDate birthDate;
	
	public Employee() {
		empId=1699;
		name="Bhargav";
		birthDate = new MyDate();
		System.out.println("Default constructor of employee");
	}

	public Employee(int empId, String name, MyDate birthDate) {
		//super();
		this.empId = empId;
		this.name = name;
		this.birthDate = birthDate;
		System.out.println("Parameterized constructor of employee");
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public void display() {
		
		System.out.println("EmpId: " + empId +
							"\tName: " + name+
							"\tDOB: " + birthDate);
	}

	public String toString() {
		return "empId= " + empId + " name=" + name + " birthDate=" + birthDate;
	}
	
	
	
	
	
}
