package com.sterlite.containment;

import com.sterlite.containment.dates.MyDate;
import com.sterlite.containment.emps.Employee;

public class ContainmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.display();
		
		Employee e2 = new Employee(2005,"Bhargav",67899,new MyDate(9,9,2000));
		e2.display();
		
		
	}

}
