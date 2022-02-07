/*
 * @author bhargav.bechara@stltech.in
 * @date 27-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Animal Class implement movable
 */
package com.phoenix.living;

import com.phoenix.interfaces.Movable;

public abstract class Animal implements Movable {

	@Override
	public void move() {
		System.out.println("Move method of Animal");
	}

}
