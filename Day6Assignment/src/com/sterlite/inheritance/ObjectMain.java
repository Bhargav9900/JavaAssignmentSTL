package com.sterlite.inheritance;

import com.sterlite.inheritance.rmp.Employee;
import com.sterlite.inheritance.rmp.WageEmployee;
import com.sterlite.inheritance.rmp.mgrs.AssistantManager;
import com.sterlite.inheritance.rmp.mgrs.Manager;

public class ObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object ob;
		ob = new Employee();
		ob = new Manager();
		ob = new WageEmployee();
		ob = new AssistantManager();
	}

}
