/*
 * @author bhargav.bechara@stltech.in
 * @date 25-01-2021 6.23 pm
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Covariant Main class
 */
package inheritance.covariant;


import inheritance.emp.EmployeeData;
import inheritance.emp.mgr.ManagerData;
import inheritance.emp.wage.WageEmpData;

public class CovariantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeData ed = new EmployeeData();
		ed.getEmployee().display();
		//System.out.println(ed.getEmployee());
		
		System.out.println();
		ManagerData m = new ManagerData(); 
		//invoke getEmployee method
		m.getEmployee().display();
		
		System.out.println();
		System.out.println();
		//display incentive
		m.getEmployee().showIncentives();
		
		
		WageEmpData wd = new WageEmpData();
		wd.getEmployee().display();
		
		System.out.println();
		
		wd.getEmployee().calculateWage();
	}

}
