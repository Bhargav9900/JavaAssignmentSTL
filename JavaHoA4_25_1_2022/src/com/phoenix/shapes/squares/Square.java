/*
 * @author bhargav.bechara@stltech.in
 * @date 25-01-2021 6.23 pm
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description demonstrate abstract class -- child class Square
 */

package com.phoenix.shapes.squares;

import com.phoenix.shapes.Shape;

public class Square extends Shape {

	private int side;
	
	public Square() {
		side = 11;
	}
		
	public Square(int side) {
		this.side = side;
	}


	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		double area = side * side;
		System.out.println("Area of given square = "+area+" m^2");

	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		double peri = 4 * side;
		System.out.println("Perimeter of given square = "+peri+" m");
	}

}
