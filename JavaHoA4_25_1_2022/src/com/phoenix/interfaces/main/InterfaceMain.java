/*
 * @author bhargav.bechara@stltech.in
 * @date 27-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Main class to demonstrate Interface
 */
package com.phoenix.interfaces.main;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Rotatable;
import com.phoenix.interfaces.Jumpable;
import com.phoenix.interfaces.Runnable;
import com.phoenix.interfaces.Walkable;
import com.phoenix.living.pet.Cat;
import com.phoenix.living.wlid.Tiger;
import com.phoenix.machines.HumanRobot;
import com.phoenix.interfaces.Revolvable;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.vehicles.cars.Car;


public class InterfaceMain {

	public static void main(String[] args) {
		
		//reference of Movable
		Movable m;
		
		//object of Earth with reference of Movable interface
		m = new Earth();
		
		//set the number of moons
		((Earth)m).setNoOfMoons(1);
		
		System.out.println(m.toString());
		
		int nm = ((Earth)m).getNoOfMoons();
		System.out.println("Earth has "+nm+" moon.");
		
		//other method of earth class
		m.move();
		
		if(((Earth)m).supportsLife()) {
			System.out.println("Earth has life");
		}
		
		((Rotatable)m).rotate();
		
		((Revolvable)m).revolve();
		System.out.println();
		System.out.println();
		//object of jupiter class
		
		m = new Jupiter();
		
		//set the number of moons
		((Jupiter)m).setNoOfMoons(79);
				
		System.out.println(m.toString());
				
		int nmj = ((Jupiter)m).getNoOfMoons();
		System.out.println("Jupiter has "+nmj+" moons.");
				
		//other method of jupiter class
		m.move();
				
		if(((Jupiter)m).supportsLife()) {
			System.out.println("Jupiter has life");
		}
		else {
			System.out.println("Jupiter does not support life");
		}
				
		((Rotatable)m).rotate();
				
		((Revolvable)m).revolve();		
		
		System.out.println();
		System.out.println();
		
		Tiger t = new Tiger();
		
		//invoke all method
		t.jump();
		t.move();
		t.run();
		t.walk();
		
		System.out.println();
		System.out.println();
		m = new Cat();
		((Cat)m).jump();
		((Cat)m).move();
		((Cat)m).run();
		((Cat)m).walk();
		
		System.out.println();
		System.out.println();
		
		//object of car
		
		m = new Car();
		
		((Car)m).move();
		((Car)m).run();
		((Car)m).stop();
		
		//object of human robot
		System.out.println();
		System.out.println();
		m = new HumanRobot();
		
		((HumanRobot)m).processData();
		((HumanRobot)m).useArtificialIntelligence();
		((HumanRobot)m).senseInfo();
		
		((Jumpable)m).jump();
		((Runnable)m).run();
		((Walkable)m).walk();
		((Movable)m).move();
	}

}
