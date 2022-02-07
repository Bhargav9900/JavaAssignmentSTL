/*
 * @author bhargav.bechara@stltech.in
 * @date 24-01-2021 5.07 pm
 * @version 2.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Represent employee entity of any orgnization.
 * 				It is super class of all other types of employee
 */
package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class InheritanceMain {

	public static void main(String[] args) {
	
		//object of employee class with parameterized constructor
		Employee e1 = new Employee(169,"Bhargav",35000.00);
		
		//display method is not visible here because this class is outside package and not inherit Employee class
		//e1.display();
		System.out.println("Display details using toString method");
		System.out.println(e1.toString());
		System.out.println();
		
		Manager m1 = new Manager();
		//invoke showIncentive method
		m1.showIncentives();
		
		//invoke display method
		m1.display();
		
		//show manager details using toString
		System.out.println(m1.toString());
		System.out.println();
		
		//object of WageEmp
		WageEmp we1 = new WageEmp();
		//invoke calculate wage method
		we1.calculateWage();
		System.out.println();
		
		we1.display();
		System.out.println();
		
		System.out.println("Using toString");
		System.out.println(we1.toString());
		
		//create object of WageEmp with parameterized
		WageEmp we2 = new WageEmp(1996,"Bhargav bechara",8,459.50f);
		System.out.println();
		we2.display();
		
		System.out.println();
		System.out.println(we2.toString());

	}

}
