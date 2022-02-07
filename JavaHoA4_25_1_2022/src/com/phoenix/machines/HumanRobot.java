/*
 * @author bhargav.bechara@stltech.in
 * @date 27-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Human Robot
 */
package com.phoenix.machines;

import com.phoenix.interfaces.Walkable;

public class HumanRobot extends Robot implements Walkable {

	@Override
	public void jump() {
		System.out.println("Human Robot can Jump");

	}

	@Override
	public void run() {
		System.out.println("Human Robot can Run");

	}

	@Override
	public void walk() {
		System.out.println("Human Robot can walk");

	}
	
	@Override
	public void move() {
		System.out.println("Move method of Human Robot");

	}
	
	public void processData() {
		System.out.println("Human Robot can process data.");
	}
	
	public void senseInfo() {
		System.out.println("Human Robot can sense Info");
	}
	
	public void useArtificialIntelligence() {
		System.out.println("Human Robot can use AI");
	}

}
