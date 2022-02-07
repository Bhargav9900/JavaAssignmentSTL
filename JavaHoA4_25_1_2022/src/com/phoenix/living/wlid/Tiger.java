/*
 * @author bhargav.bechara@stltech.in
 * @date 27-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Tiger class
 */
package com.phoenix.living.wlid;

import com.phoenix.interfaces.Walkable;
import com.phoenix.living.Animal;

public class Tiger extends Animal implements Walkable {

	
	@Override
	public void jump() {
		System.out.println("Jump method of Tiger");
	}

	@Override
	public void run() {
		System.out.println("Run method of Tiger");
	}

	@Override
	public void walk() {
		System.out.println("Walk method of Tiger");
	}
	
	@Override
	public void move() {
		System.out.println("Move method of Tiger");
	}

}
