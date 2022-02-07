/*
 * @author bhargav.bechara@stltech.in
 * @date 27-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Earth class subclass of Planet
 */
package com.phoenix.planets;

public class Earth extends Planet {

	
	@Override
	public boolean supportsLife() {
		System.out.println("Earth support life");
		return true;
	}
	
	@Override
	public void revolve() {
		System.out.println("Revolve method of Earth");
	}

	@Override
	public void rotate() {
		System.out.println("Rotate method of Earth");
	}

	@Override
	public void move() {
		System.out.println("Move method of Earth");
	}

}
