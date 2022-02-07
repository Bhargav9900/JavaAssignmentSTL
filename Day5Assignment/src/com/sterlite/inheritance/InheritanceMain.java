package com.sterlite.inheritance;

import com.sterlite.inheritance.rmp.WageEmployee;
import com.sterlite.inheritance.rmp.mgrs.AssistantManager;
import com.sterlite.inheritance.rmp.mgrs.Manager;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m1 = new Manager();
		m1.display();//invoking inherited method
		m1.showIncentive();//invoking special method
		
		
		System.out.println();
		
		Manager m2 = new Manager(1611,"bhargav bechara",34562.00,5000.0f);
		m2.display();
		m2.showIncentive();
		
		
		System.out.println();
		AssistantManager a1 = new AssistantManager(1611,"bhargav",34562.00,5000.0f,20);
		a1.display(); //invoking inherited method
		a1.showIncentive();//invoking inherited method
		
		WageEmployee we = new WageEmployee(1611,"bhargav bechara",34562.00,8,500.0f);
		we.display();
		we.calculateWage();
		
		System.out.println();
		
		
	}

}
