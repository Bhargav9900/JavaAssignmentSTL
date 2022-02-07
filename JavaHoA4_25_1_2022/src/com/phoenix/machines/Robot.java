/*
 * @author bhargav.bechara@stltech.in
 * @date 27-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Robot
 */
package com.phoenix.machines;

import com.phoenix.interfaces.Movable;

public class Robot implements Movable {

	@Override
	public void move() {
		System.out.println("Move method of Robot");

	}
	
	public void processData() {
		System.out.println("Robot can process data.");
	}
	
	public void senseInfo() {
		System.out.println("Robot can sense Info");
	}
	
	public void useArtificialIntelligence() {
		System.out.println("Robot can use AI");
	}

}
