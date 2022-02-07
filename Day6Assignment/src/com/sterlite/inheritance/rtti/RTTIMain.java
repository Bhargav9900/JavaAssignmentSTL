package com.sterlite.inheritance.rtti;

import com.sterlite.inheritance.rmp.Employee;
import com.sterlite.inheritance.rmp.WageEmployee;
import com.sterlite.inheritance.rmp.mgrs.AssistantManager;
import com.sterlite.inheritance.rmp.mgrs.Manager;

public class RTTIMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		//In inheritance, object of subclass can be created using super class reference
//		// Alternatively, superclass reference can be used to refer to subclass object
//		// Every object reference has two types
//		// Static type is datatype using which reference is declared
//		//dynamic type is datatype of which object being refer to by reference
//		Employee e = null;// static type of e is Employee
//		
//		e = new Employee();//Dynamic type of e is Employee
//		e.display();
//		
//		e = new Manager();//Dynamic type of e is Manager
//		e.display();
//		((Manager)e).showIncentive();//down type casting casting within hiererchy reference type casting
//		
//		
//		e = new AssistantManager();//Dynamic type of e is AssistantManager
//		e.display();
//		
//		e = new WageEmployee();//Dynamic type of e is WageEmployee
//		e.display();
//		
//		WageEmployee we = (WageEmployee)e;//down type casting casting within hierarchy reference type casting
//		we.calculateWage();
		
		showEmployeeInfo(new Employee());
		System.out.println();
		showEmployeeInfo(new Manager());
		System.out.println();
		showEmployeeInfo(new WageEmployee());
		
		//final variable
		
		final int a =10;
		System.out.println(a);
		//a=20;
		//System.out.println(a);
		
	}
	public static void showEmployeeInfo(Employee e) {
		e.display();
		if(e instanceof Manager) {
		((Manager)e).showIncentive();
		}
		
		if(e instanceof WageEmployee) {
			((WageEmployee)e).calculateWage();
		}
	}

}
