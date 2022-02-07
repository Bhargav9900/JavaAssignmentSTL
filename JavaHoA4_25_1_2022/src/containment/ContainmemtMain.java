/*
 * @author bhargav.bechara@stltech.in
 * @date 24-01-2021 04:11 am
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description containment main class
 */
package containment;

import containment.date.MyDate;
import containment.emp.Employee;

public class ContainmemtMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.display();
		
		e1.setEmpId(1139);
		e1.setName("SetName");
		e1.setBirthDate(new MyDate(16,9,2000));
		
		System.out.println();
		System.out.println("Print details using get methods of employee class");
		
		System.out.println("EmpID: "+e1.getEmpId());
		System.out.println("Name: "+e1.getName());
		System.out.println("DOB: "+e1.getBirthDate());
		
		System.out.println();
		System.out.println("Show employee details using toString");
		System.out.println(e1.toString());
		
		System.out.println();
		System.out.println("Show employee details using parameterized constructor");
		Employee e2 = new Employee(654,"Bhargav Bechara",new MyDate(13,8,1999));
		e2.display();
	}

}
