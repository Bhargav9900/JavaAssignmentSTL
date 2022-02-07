/*
 * @author bhargav.bechara@stltech.in
 * @date 25-01-2021 6.23 pm
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description demonstrate abstract class -- child class Rectangle
 */
package com.phoenix.shapes.rectangles;

import com.phoenix.shapes.Shape;

public class Rectangle extends Shape {
	
	private int length;
	private int breadth;
	
	public Rectangle() {
		length = 16;
		breadth = 9;
	}
	

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void calculateArea() {
		
		double area = length * breadth;
		System.out.println("Area of given rectangel = "+area+" m^2");

	}

	@Override
	public void calculatePerimeter() {
		
		double peri =  2 * (length + breadth);
		System.out.println("Perimeter of given rectangel = "+peri+" m");
	}

}
