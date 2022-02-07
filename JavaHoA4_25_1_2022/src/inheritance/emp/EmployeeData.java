/*
 * @author bhargav.bechara@stltech.in
 * @date 25-01-2021 4.23 pm
 * @version 2.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Covariant Return type EmployeeData
 */
package inheritance.emp;

public class EmployeeData {

	public Employee getEmployee() {
		return new Employee(169,"Bhargav",67000.00);
	}
}
