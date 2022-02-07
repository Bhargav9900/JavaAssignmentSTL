/*
 * @author bhargav.bechara@stltech.in
 * @date 25-01-2021 6.23 pm
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description demonstrate abstract class -- child class Circle
 */
package com.phoenix.shapes.circle;

import com.phoenix.shapes.Shape;

public class Circle extends Shape {

	private float radius;
	
	public Circle(){
		radius = 5.5f;
	}
		
	public Circle(float radius) {
		this.radius = radius;
	}


	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		double area = MATH_PI * Math.pow(radius, 2);
		System.out.println("Area of given circle = "+area+" m^2");
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		double peri = 2 * MATH_PI * radius;
		System.out.println("Perimeter of given circle = "+peri+" m");
	}

}
