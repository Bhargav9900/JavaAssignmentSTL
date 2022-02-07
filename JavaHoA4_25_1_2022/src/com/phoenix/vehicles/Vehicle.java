/*
 * @author bhargav.bechara@stltech.in
 * @date 27-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Vehicle class
 */
package com.phoenix.vehicles;

public abstract class Vehicle {

	protected void run() {
		System.out.println("Vehicle Running");
	}
	
	protected void stop() {
		System.out.println("Vehicle stop");
	}
}
