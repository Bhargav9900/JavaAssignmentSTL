/*
 * @author bhargav.bechara@stltech.in
 * @date 25-01-2021 5.22 pm
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description instance of method
 */

package inheritance;



import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class RTTIMain {

	public static void main(String[] args) {
		
		Manager m1 = new Manager(1165,"Bhargav B",34500.00,67000.00);
		//invoke showEmpInfo method
		showEmpInfo(m1);
		
		WageEmp we1 = new WageEmp(654,"Bechara Bhargav",10,650.0f);
		//invoke showEmpInfo method
		showEmpInfo(we1);
	}
	
	public static void showEmpInfo(Employee e) {
		
		e.display();
		
		if(e instanceof Manager) {
			System.out.println("\n\nSpecial method of Manager called\n");
			((Manager)e).showIncentives();
		}
			
		if(e instanceof WageEmp) {
			System.out.println("\nSpecial method of WageEmp called\n");
			((WageEmp)e).calculateWage();
		}
	}
	
}
