/*
 * @author bhargav.bechara@stltech.in
 * @date 25-01-2021 6.23 pm
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description demonstrate abstract class
 */
package com.phoenix.shapes.main;

import com.phoenix.shapes.Shape;
import com.phoenix.shapes.circle.Circle;
import com.phoenix.shapes.rectangles.Rectangle;
import com.phoenix.shapes.squares.Square;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = null;
		
		s = new Circle(69.5f);
		
		System.out.println("Area and Perimeter for Circle");
		//display area and perimeter
		s.calculateArea();
		s.calculatePerimeter();
		System.out.println();
		
		s = new Rectangle(61,16);
		System.out.println("Area and Perimeter for Reactangle");
		
		s.calculateArea();
		s.calculatePerimeter();
		System.out.println();
		
		s = new Square(65);
		System.out.println("Area and Perimeter for Square");
		
		s.calculateArea();
		s.calculatePerimeter();
		

	}

}
