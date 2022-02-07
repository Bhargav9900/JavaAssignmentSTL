/*
 * @author bhargav.bechara@stltech.in
 * @date 27-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Cat class
 */
package com.phoenix.living.pet;

import com.phoenix.interfaces.Walkable;
import com.phoenix.living.Animal;

public class Cat extends Animal implements Walkable {

	@Override
	public void jump() {
		System.out.println("Jump method of Cat");

	}

	@Override
	public void run() {
		System.out.println("Run method of Cat");

	}

	@Override
	public void walk() {
		System.out.println("Walk method of Cat");

	}
	
	@Override
	public void move() {
		System.out.println("Move method of Cat");
	}

}
