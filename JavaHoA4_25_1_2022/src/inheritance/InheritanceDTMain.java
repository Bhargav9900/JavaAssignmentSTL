/*
 * @author bhargav.bechara@stltech.in
 * @date 25-01-2021 5.07 pm
 * @version 2.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Reference type casting
 */
package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class InheritanceDTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = null;
		
		e = new Manager(1699,"Bhargav",45000.00f,5000.0f);//superclass reference of Manager
		//invoke display method of Manager
		e.display();
		
		System.out.println();
		System.out.println();
		//reference type 
		((Manager)e).showIncentives();
		
		System.out.println();
		e = new WageEmp(654,"Bechara Bhargav",9,650.0f);
		e.display();
		
		System.out.println();
		((WageEmp)e).calculateWage();
	}

}
