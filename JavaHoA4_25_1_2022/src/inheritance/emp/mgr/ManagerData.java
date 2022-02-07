/*
 * @author bhargav.bechara@stltech.in
 * @date 25-01-2021 4.23 pm
 * @version 2.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Covariant Return type ManagerData
 */
package inheritance.emp.mgr;


import inheritance.emp.EmployeeData;

public class ManagerData extends EmployeeData {

	public Manager getEmployee() {
		return new Manager();
	}
}
