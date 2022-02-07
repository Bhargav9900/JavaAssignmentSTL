/*
 * @author bhargav.bechara@stltech.in
 * @date 27-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Planets
 */
package com.phoenix.planets;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Revolvable;
import com.phoenix.interfaces.Rotatable;

public abstract class Planet implements Movable, Rotatable, Revolvable {

	//instance variable
	private int noOfMoons;
	
	@Override
	public void revolve() {
		System.out.println("Revolve method of Planet");
	}

	@Override
	public void rotate() {
		System.out.println("Rotate method of Planet");
	}

	@Override
	public void move() {
		System.out.println("Move method of Planet");
	}

	public int getNoOfMoons() {
		return noOfMoons;
	}

	public void setNoOfMoons(int noOfMoons) {
		this.noOfMoons = noOfMoons;
	}
	
	protected abstract boolean supportsLife();

	@Override
	public String toString() {
		return "No of Moons = " + noOfMoons;
	}
	
	
	

}
