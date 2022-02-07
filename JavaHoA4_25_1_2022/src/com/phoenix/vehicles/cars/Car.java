/*
 * @author bhargav.bechara@stltech.in
 * @date 27-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Car class
 */
package com.phoenix.vehicles.cars;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Runnable;
import com.phoenix.vehicles.Vehicle;

public class Car extends Vehicle implements Movable, Runnable {

	@Override
	public void move() {
		System.out.println("Move method of Car");

	}
		
	public void run() {
		System.out.println("Car Running");
	}
	
	public void stop() {
		System.out.println("Car stop");
	}

}
