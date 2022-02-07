/*
 * @author bhargav.bechara@stltech.in
 * @date 25-01-2021 6.23 pm
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Covariant Return type ManagerData
 */
package inheritance.emp.wage;

import inheritance.emp.EmployeeData;
import inheritance.emp.WageEmp;


public class WageEmpData extends EmployeeData {

	public WageEmp getEmployee() {
		return new WageEmp();
	}
	
}
