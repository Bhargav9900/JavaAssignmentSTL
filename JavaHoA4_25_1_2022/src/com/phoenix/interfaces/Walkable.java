/*
 * @author bhargav.bechara@stltech.in
 * @date 27-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Walkable interface subtype of Jumpable and Runnable
 */
package com.phoenix.interfaces;

public interface Walkable extends Jumpable,Runnable{
	
	void walk();

}
