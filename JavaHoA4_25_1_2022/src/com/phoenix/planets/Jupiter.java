/*
 * @author bhargav.bechara@stltech.in
 * @date 27-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Jupiter class subclass of Planet
 */
package com.phoenix.planets;

public class Jupiter extends Planet {

	@Override
	public boolean supportsLife() {
		System.out.println("Jupiter does not support life");
		return false;
	}

	@Override
	public void revolve() {
		System.out.println("Revolve method of Jupiter");
	}

	@Override
	public void rotate() {
		System.out.println("Rotate method of Jupiter");
	}

	@Override
	public void move() {
		System.out.println("Move method of Jupiter");
	}

}
